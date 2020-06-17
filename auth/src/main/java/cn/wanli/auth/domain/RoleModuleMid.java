package cn.wanli.auth.domain;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 权限模块中间表, 用来描述指定角色对应的模块
 *
 * @author wanli
 */
public class RoleModuleMid implements Serializable {
    private Long id;
    private Long roleId;
    private Long moduleId;
    private LocalDateTime createdTime;

    public RoleModuleMid() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
