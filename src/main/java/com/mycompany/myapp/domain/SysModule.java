package com.mycompany.myapp.domain;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "sys_module", schema = "voffice", catalog = "")
public class SysModule {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "code")
    private String code;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "tenant_id")
    private Integer tenantId;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "status")
    private Integer status;

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    @Basic
    @Column(name = "parent_id")
    private Integer parentId;

    @Basic
    @Column(name = "path_url")
    private String pathUrl;

    @Basic
    @Column(name = "position")
    private Integer position;

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

    @Basic
    @Column(name = "icon")
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
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

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPathUrl() {
        return pathUrl;
    }

    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysModule sysModule = (SysModule) o;

        if (id != null ? !id.equals(sysModule.id) : sysModule.id != null) return false;
        if (code != null ? !code.equals(sysModule.code) : sysModule.code != null) return false;
        if (name != null ? !name.equals(sysModule.name) : sysModule.name != null) return false;
        if (tenantId != null ? !tenantId.equals(sysModule.tenantId) : sysModule.tenantId != null) return false;
        if (description != null ? !description.equals(sysModule.description) : sysModule.description != null) return false;
        if (status != null ? !status.equals(sysModule.status) : sysModule.status != null) return false;
        if (updateTime != null ? !updateTime.equals(sysModule.updateTime) : sysModule.updateTime != null) return false;
        if (parentId != null ? !parentId.equals(sysModule.parentId) : sysModule.parentId != null) return false;
        if (pathUrl != null ? !pathUrl.equals(sysModule.pathUrl) : sysModule.pathUrl != null) return false;
        if (position != null ? !position.equals(sysModule.position) : sysModule.position != null) return false;
        if (isActive != null ? !isActive.equals(sysModule.isActive) : sysModule.isActive != null) return false;
        if (createBy != null ? !createBy.equals(sysModule.createBy) : sysModule.createBy != null) return false;
        if (createDate != null ? !createDate.equals(sysModule.createDate) : sysModule.createDate != null) return false;
        if (updateBy != null ? !updateBy.equals(sysModule.updateBy) : sysModule.updateBy != null) return false;
        if (icon != null ? !icon.equals(sysModule.icon) : sysModule.icon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (pathUrl != null ? pathUrl.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        return result;
    }
}
