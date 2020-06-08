package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 操作类, 用来描述系统api的实体
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation implements Serializable {
    private Long id;
    private String name;
    private String url;
    private String method;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
