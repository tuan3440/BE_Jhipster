package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysModuleActionDTO {

    private Long id;
    private Long moduleId;
    private Long actionId;
    private Timestamp updateTime;
    private Integer isActive;
    private String updateBy;
}
