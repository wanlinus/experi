package cn.wanli.common.entity;

import cn.wanli.common.utils.JSON;

/**
 * 服务返回数据对象
 *
 * @param <T>
 * @author wanli
 */
public class ServerResp<T> {
    private String respCode;
    private String respMsg;
    private T data;

    public ServerResp() {
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
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
