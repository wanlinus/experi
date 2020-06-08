package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 模块和操作中间表, 用来描述指定模块需要的相应api
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModuleOperationMid implements Serializable {
    private Long id;
    private Long moduleId;
    private Long operationId;
    private LocalDateTime createdTime;
}
