package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.ChangePwDTO;
import com.mycompany.myapp.service.dto.SysUserDTO;
import com.mycompany.myapp.web.rest.vm.LoginVM;
import java.io.UnsupportedEncodingException;

public interface SysUserService {
    void validateCaptcha(LoginVM loginVM);
    SysUserDTO findByEmail(String email);

    String createHashKey(SysUserDTO sysUserDTO) throws UnsupportedEncodingException;

    void resetPassword(ChangePwDTO changePwdDTO);
}
