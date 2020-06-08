package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 角色表
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private Long id;
    /**
     * 角色名
     */
    private String name;
    /**
     * 角色等级, 1 超级管理员,2 普通管理员,3 普通用户
     */
    private Integer grade;
    /**
     * 角色描述
     */
    private String desc;
    /**
     * 由谁创建
     */
    private Long createdBy;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
