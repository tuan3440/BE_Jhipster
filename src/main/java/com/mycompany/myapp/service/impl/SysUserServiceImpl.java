package com.mycompany.myapp.service.impl;

import com.google.gson.Gson;
import com.mycompany.myapp.constant.ResponseCode;
import com.mycompany.myapp.domain.SysUser;
import com.mycompany.myapp.repository.SysUserRepository;
import com.mycompany.myapp.service.RedisSevice;
import com.mycompany.myapp.service.SysUserService;
import com.mycompany.myapp.service.captcha.CommonUtil;
import com.mycompany.myapp.service.dto.ChangePwDTO;
import com.mycompany.myapp.service.dto.SysUserDTO;
import com.mycompany.myapp.service.mapper.SysUserMapper;
import com.mycompany.myapp.service.model.RequestPasswordModel;
import com.mycompany.myapp.utils.StringUtil;
import com.mycompany.myapp.utils.ValidateUtil;
import com.mycompany.myapp.web.rest.errors.CustomException;
import com.mycompany.myapp.web.rest.vm.LoginVM;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.jhipster.security.RandomUtil;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    private RedisSevice redisSevice;
    private final SysUserRepository sysUserRepository;
    private final SysUserMapper sysUserMapper;
    private final PasswordEncoder passwordEncoder;

    SysUserServiceImpl(
        RedisSevice redisSevice,
        SysUserRepository sysUserRepository,
        SysUserMapper sysUserMapper,
        PasswordEncoder passwordEncoder
    ) {
        this.redisSevice = redisSevice;
        this.sysUserRepository = sysUserRepository;
        this.sysUserMapper = sysUserMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void validateCaptcha(LoginVM loginVM) {
        String captcha = loginVM.getCaptcha();
        String captchaEncode = CommonUtil.encrypt(captcha);
        String captchaReal = this.redisSevice.getValue(captcha);
        if (!captchaEncode.equals(captchaReal)) {
            throw new RuntimeException();
        }
    }

    @Override
    public SysUserDTO findByEmail(String email) {
        return sysUserRepository.findByEmail(email).map(sysUserMapper::toDto).orElse(null);
    }

    @Override
    public String createHashKey(SysUserDTO sysUserDTO) throws UnsupportedEncodingException {
        String refreshToken = RandomUtil.generateResetKey();
        sysUserDTO.setResetKey(refreshToken);
        sysUserRepository.save(sysUserMapper.toEntity(sysUserDTO));

        RequestPasswordModel requestPasswordModel = new RequestPasswordModel();
        requestPasswordModel.setUserId(sysUserDTO.getId());
        requestPasswordModel.setResetKey(refreshToken);
        requestPasswordModel.setExpiredTime(System.currentTimeMillis() + 30 * 60 * 1000);
        String key = "";
        String encryptRequestPasswordModel = CommonUtil.encrypt(new Gson().toJson(requestPasswordModel));
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(encryptRequestPasswordModel)) {
            key = URLEncoder.encode(encryptRequestPasswordModel, StandardCharsets.UTF_8.name());
        }
        return key;
    }

    @Override
    public void resetPassword(ChangePwDTO changePwdDTO) {
        if (StringUtil.isBlank(changePwdDTO.getKey())) {
            throw new CustomException(ResponseCode.CODE.INVALID_INPUT_DATA, ResponseCode.MSG.INVALID_INPUT_DATA, "error.key.invalid");
        }
        RequestPasswordModel requestPasswordModel;
        requestPasswordModel =
            new Gson()
                .fromJson(CommonUtil.decrypt(URLDecoder.decode(changePwdDTO.getKey(), StandardCharsets.UTF_8)), RequestPasswordModel.class);
        if (requestPasswordModel.getExpiredTime() < System.currentTimeMillis()) {
            throw new CustomException(ResponseCode.CODE.EXPIRED, ResponseCode.MSG.EXPIRED, "error.key.expired");
        }
        if (StringUtil.isBlank(requestPasswordModel.getResetKey())) {
            throw new CustomException(ResponseCode.CODE.INVALID_INPUT_DATA, ResponseCode.MSG.INVALID_INPUT_DATA, "error.key.invalid");
        }
        SysUser sysUser = sysUserRepository
            .findByIdAndResetKey(requestPasswordModel.getUserId(), requestPasswordModel.getResetKey())
            .orElse(null);
        if (sysUser == null) {
            throw new CustomException(ResponseCode.CODE.INVALID_INPUT_DATA, ResponseCode.MSG.INVALID_INPUT_DATA, "error.key.invalid");
        }
        if (!ValidateUtil.checkResetPass(changePwdDTO.getComPass(), changePwdDTO.getNewPass())) {
            throw new CustomException(
                ResponseCode.CODE.INVALID_INPUT_DATA,
                ResponseCode.MSG.INVALID_INPUT_DATA,
                "error.newPassword.invalid"
            );
        }
        completePasswordForget(sysUser, changePwdDTO.getNewPass());
    }

    private void completePasswordForget(SysUser sysUser, String newPassword) {
        sysUser.setPassword(passwordEncoder.encode(newPassword));
        sysUser.setResetKey(null);
        sysUserRepository.save(sysUser);
    }
}
