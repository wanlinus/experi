package cn.wanli.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 通用分页数据传输对象
 *
 * @param <T> 泛型
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageData<T> implements Serializable {
    /**
     * 当前页
     */
    private Integer page = 1;
    /**
     * 每页条数
     */
    private Integer size = 10;
    /**
     * 总数据量
     */
    private Long total = 0L;
    /**
     * 数据集合
     */
    private List<T> data = Collections.emptyList();
}
