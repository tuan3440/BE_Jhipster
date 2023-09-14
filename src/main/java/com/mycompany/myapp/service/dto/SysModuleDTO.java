package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysModuleDTO {

    private Integer id;
    private String code;
    private String name;
    private Integer tenantId;
    private String description;
    private Integer status;
    private Timestamp updateTime;
    private Integer parentId;
    private String pathUrl;
    private Integer position;
    private Integer isActive;
    private String createBy;
    private Timestamp createDate;
    private String updateBy;
    private String icon;
}
