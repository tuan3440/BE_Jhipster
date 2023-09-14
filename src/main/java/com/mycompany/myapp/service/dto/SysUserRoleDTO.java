package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysUserRoleDTO {

    private Long id;
    private Integer userId;
    private Integer roleId;
    private Timestamp updateTime;
    private Integer tenantId;
    private Integer isActive;
    private String updateBy;
    private Timestamp updateDate;
}
