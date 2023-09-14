package com.mycompany.myapp.domain;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "sys_action", schema = "voffice", catalog = "")
public class SysAction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "code")
    private Long code;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "status")
    private Integer status;

    @Basic
    @Column(name = "tenant_id")
    private Integer tenantId;

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    @Basic
    @Column(name = "is_active")
    private Integer isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysAction sysAction = (SysAction) o;

        if (id != null ? !id.equals(sysAction.id) : sysAction.id != null) return false;
        if (code != null ? !code.equals(sysAction.code) : sysAction.code != null) return false;
        if (name != null ? !name.equals(sysAction.name) : sysAction.name != null) return false;
        if (description != null ? !description.equals(sysAction.description) : sysAction.description != null) return false;
        if (status != null ? !status.equals(sysAction.status) : sysAction.status != null) return false;
        if (tenantId != null ? !tenantId.equals(sysAction.tenantId) : sysAction.tenantId != null) return false;
        if (updateTime != null ? !updateTime.equals(sysAction.updateTime) : sysAction.updateTime != null) return false;
        if (isActive != null ? !isActive.equals(sysAction.isActive) : sysAction.isActive != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        return result;
    }
}
