package com.mycompany.myapp.domain;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "sys_role", schema = "voffice", catalog = "")
public class SysRole {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "code")
    private String code;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "status")
    private Integer status;

    @Basic
    @Column(name = "update_date")
    private Timestamp updateDate;

    @Basic
    @Column(name = "tenant_id")
    private Integer tenantId;

    @Basic
    @Column(name = "is_active")
    private Integer isActive;

    @Basic
    @Column(name = "create_by")
    private String createBy;

    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;

    @Basic
    @Column(name = "update_by")
    private String updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysRole sysRole = (SysRole) o;

        if (id != null ? !id.equals(sysRole.id) : sysRole.id != null) return false;
        if (name != null ? !name.equals(sysRole.name) : sysRole.name != null) return false;
        if (code != null ? !code.equals(sysRole.code) : sysRole.code != null) return false;
        if (description != null ? !description.equals(sysRole.description) : sysRole.description != null) return false;
        if (status != null ? !status.equals(sysRole.status) : sysRole.status != null) return false;
        if (updateDate != null ? !updateDate.equals(sysRole.updateDate) : sysRole.updateDate != null) return false;
        if (tenantId != null ? !tenantId.equals(sysRole.tenantId) : sysRole.tenantId != null) return false;
        if (isActive != null ? !isActive.equals(sysRole.isActive) : sysRole.isActive != null) return false;
        if (createBy != null ? !createBy.equals(sysRole.createBy) : sysRole.createBy != null) return false;
        if (createDate != null ? !createDate.equals(sysRole.createDate) : sysRole.createDate != null) return false;
        if (updateBy != null ? !updateBy.equals(sysRole.updateBy) : sysRole.updateBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        return result;
    }
}
