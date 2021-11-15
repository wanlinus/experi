package cn.wanli.common.vo;

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

    public ServerResp(T data) {
        this.data = data;
    }

    public ServerResp(T data, String respCode, String respMsg) {
        this.data = data;
        this.respCode = respCode;
        this.respMsg = respMsg;

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
