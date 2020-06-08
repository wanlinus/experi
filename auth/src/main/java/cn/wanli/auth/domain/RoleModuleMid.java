package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 权限模块中间表, 用来描述指定角色对应的模块
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleModuleMid implements Serializable {
    private Long id;
    private Long roleId;
    private Long moduleId;
    private LocalDateTime createdTime;
}
