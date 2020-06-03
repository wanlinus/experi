package cn.wanli.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageRequest implements Serializable {

    @Min(value = 1, message = "请求页不能小于1")
    private Integer page;

    @Size(min = 1, max = 100, message = "分页请求数量必须在1~100之间")
    private Integer size = 10;

    @Size(max = 10, message = "查询字符串的最大长度为20")
    private String keyword = "";
}
