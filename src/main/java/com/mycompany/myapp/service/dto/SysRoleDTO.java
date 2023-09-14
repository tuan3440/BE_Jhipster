package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysRoleDTO {

    private Long id;
    private String name;
    private String code;
    private String description;
    private Integer status;
    private Timestamp updateDate;
    private Integer tenantId;
    private Integer isActive;
    private String createBy;
    private Timestamp createDate;
    private String updateBy;
}
