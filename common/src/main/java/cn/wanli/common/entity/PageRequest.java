package cn.wanli.common.entity;

import cn.wanli.common.utils.JSON;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 通用分页请求数据
 *
 * @author wanli
 */
public class PageRequest implements Serializable {

    @Min(value = 1, message = "请求页不能小于1")
    private Integer page = 1;

    @Size(min = 1, max = 100, message = "分页请求数量必须在1~100之间")
    private Integer size = 10;

    @Size(max = 10, message = "查询字符串的最大长度为20")
    private String keyword = "";

    public PageRequest() {
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
