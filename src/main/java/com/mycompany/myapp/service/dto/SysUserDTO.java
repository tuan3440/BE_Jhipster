package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysUserDTO {

    private Long id;
    private String userName;
    private String fullName;
    private String passwordHash;
    private Integer gender;
    private Timestamp dateOfBirth;
    private String birthPlace;
    private String identityCard;
    private Integer positionId;
    private String positionName;
    private Integer deptId;
    private String deptName;
    private String imageUrl;
    private Integer status;
    private String activationKey;
    private String resetKey;
    private String createdBy;
    private Timestamp createdDate;
    private Timestamp resetDate;
    private String lastModifiedBy;
    private Timestamp lastModifiedDate;
    private String email;
    private Integer tenantId;
    private Long orgId;
    private String description;
    private String cellphone;
    private Integer isActive;
    private Timestamp updateDate;
    private String updateBy;
    private Timestamp lastChangePassword;
    private Timestamp lastResetPassword;
    private Integer loginFailureCount;
}
