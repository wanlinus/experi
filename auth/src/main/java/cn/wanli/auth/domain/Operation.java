package cn.wanli.auth.domain;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 操作类, 用来描述系统api的实体
 *
 * @author wanli
 */
public class Operation implements Serializable {
    private Long id;
    private String name;
    private String url;
    private String method;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public Operation() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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
