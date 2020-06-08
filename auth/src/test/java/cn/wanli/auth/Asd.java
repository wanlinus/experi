package cn.wanli.auth;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Asd {
    @Test
    public void asd() {
        List<Object> collect = Stream.empty().map(i -> {
            return i;
        }).collect(toList());
        System.out.println(collect);

    }
}
