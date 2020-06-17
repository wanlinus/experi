package cn.wanli.auth.domain;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 账户角色中间表, 用来记录账户和角色关系实体
 *
 * @author wanli
 */
public class AccountRoleMid implements Serializable {
    private Long id;
    private Long accountId;
    private Long roleId;
    private LocalDateTime createdTime;

    public AccountRoleMid() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
