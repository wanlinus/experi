package cn.wanli.auth.domain;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 模块和操作中间表, 用来描述指定模块需要的相应api
 *
 * @author wanli
 */
public class ModuleOperationMid implements Serializable {
    private Long id;
    private Long moduleId;
    private Long operationId;
    private LocalDateTime createdTime;

    public ModuleOperationMid() {
    }

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

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
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
