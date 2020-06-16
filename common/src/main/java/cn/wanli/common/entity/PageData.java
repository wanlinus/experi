package cn.wanli.common.entity;

import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 通用分页数据传输对象
 *
 * @param <T> 泛型
 * @author wanli
 */
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

    public PageData() {
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
