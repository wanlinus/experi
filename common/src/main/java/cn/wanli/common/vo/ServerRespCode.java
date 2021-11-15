package cn.wanli.common.vo;

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
    SUCCESS("1000000", "请求成功"),
    ACCESS_DENIED("4000001", "禁止访问"),
    USER_NOT_FOUND("5000001", "用户或密码错误");

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

