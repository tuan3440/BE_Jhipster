package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.SysUser;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    Optional<SysUser> findByEmail(String email);

    Optional<SysUser> findByIdAndResetKey(long userId, String resetKey);
}
