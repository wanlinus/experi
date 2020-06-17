package cn.wanli.auth.domain;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 角色表
 *
 * @author wanli
 */
public class Role implements Serializable {

    private Long id;
    /**
     * 角色名
     */
    private String name;
    /**
     * 角色等级, 1 超级管理员,2 普通管理员,3 普通用户
     */
    private Integer grade;
    /**
     * 角色描述
     */
    private String desc;
    /**
     * 由谁创建
     */
    private Long createdBy;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;

    public Role() {
    }

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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
