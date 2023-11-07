package com.mycompany.myapp.domain;

import java.util.List;

public class ModuleTree {

    private Long id;
    private String code;
    private String name;
    private Integer status;
    private List<ModuleTree> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ModuleTree> getChildren() {
        return children;
    }

    public void setChildren(List<ModuleTree> children) {
        this.children = children;
    }
}
