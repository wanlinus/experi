package cn.wanli.common.entity;

import cn.wanli.common.utils.JSON;

/**
 * 服务响应码
 *
 * @author wanli
 */
public enum ServerRespCode {

    /**
     * 服务器响应码具体
     */
    ACCESS_DENIED("404", "禁止访问");

    private final String value;
    private final String desc;

    ServerRespCode(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

