package com.mycompany.myapp.domain;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "sys_module_action", schema = "voffice", catalog = "")
public class SysModuleAction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "module_id")
    private Long moduleId;

    @Basic
    @Column(name = "action_id")
    private Long actionId;

    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    @Basic
    @Column(name = "is_active")
    private Integer isActive;

    @Basic
    @Column(name = "update_by")
    private String updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
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

        SysModuleAction that = (SysModuleAction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (moduleId != null ? !moduleId.equals(that.moduleId) : that.moduleId != null) return false;
        if (actionId != null ? !actionId.equals(that.actionId) : that.actionId != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (updateBy != null ? !updateBy.equals(that.updateBy) : that.updateBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (moduleId != null ? moduleId.hashCode() : 0);
        result = 31 * result + (actionId != null ? actionId.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (updateBy != null ? updateBy.hashCode() : 0);
        return result;
    }
}
