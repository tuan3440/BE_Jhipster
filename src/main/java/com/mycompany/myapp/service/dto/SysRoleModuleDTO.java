package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysRoleModuleDTO {

    private Long id;
    private Long roleId;
    private String moduleCode;
    private String actionCode;
    private Timestamp updateTime;
    private Integer isActive;
    private String updateBy;
    private Long moduleId;
}
