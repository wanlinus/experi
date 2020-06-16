package cn.wanli.common.entity;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;

/**
 * 服务返回数据对象
 *
 * @param <T>
 * @author wanli
 */
public class ServerResp<T> implements Serializable {
    private String errorCode;
    private String errorMsg;
    private T data;

    public ServerResp() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
