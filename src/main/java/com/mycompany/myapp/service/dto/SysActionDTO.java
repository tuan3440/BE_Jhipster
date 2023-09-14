package com.mycompany.myapp.service.dto;

import java.sql.Timestamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SysActionDTO {

    private Long id;
    private Long code;
    private String name;
    private String description;
    private Integer status;
    private Integer tenantId;
    private Timestamp updateTime;
    private Integer isActive;
}
