package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 模块实体, 大粒度划分系统功能
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Module implements Serializable {
    private Long id;
    private String name;
    /**
     * 模块属于树形结构, 有父节点和子节点,只使用此字段来描述父节点
     */
    private Long parentId;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
