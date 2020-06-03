package cn.wanli.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 服务返回数据对象
 *
 * @param <T>
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerResp<T> implements Serializable {
    private String errorCode;
    private String errorMsg;
    private T data;
}
