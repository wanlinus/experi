package cn.wanli.common.utils;

import cn.wanli.common.entity.ServerResp;

import static cn.wanli.common.entity.ServerRespCode.SUCCESS;

/**
 * @author wanli
 */
public final class ReturnUtils {

    private ReturnUtils() {
        throw new AssertionError("工具类禁止实例化");
    }

    public static <T> ServerResp<T> success(T t) {
        ServerResp<T> serverResp = new ServerResp<>();
        serverResp.setData(t);
        serverResp.setRespCode(SUCCESS.getDesc());
        serverResp.setRespCode(SUCCESS.getValue());
        return serverResp;
    }
}
