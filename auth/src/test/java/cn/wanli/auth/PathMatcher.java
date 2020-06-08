package cn.wanli.auth;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.util.AntPathMatcher;

import java.util.Map;

public class PathMatcher {
    /**
     * 测试AntPathMatcher路径匹配功能
     */
    @Test
    public void extractUriTemplateVariables() {
        AntPathMatcher matcher = new AntPathMatcher();
        boolean match = matcher.match("/home/{name}/{id}", "/home/asd/ad");
        System.out.println(match);
        Map<String, String> map = matcher.extractUriTemplateVariables("/home/{name}/{id}", "/home/asd/ad");
        System.out.println(JSON.toJSONString(map));
//        Assert.isTrue(match, "错误");
    }
}
