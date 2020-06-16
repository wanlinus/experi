package cn.wanli;

import cn.wanli.common.utils.JSON;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

public class CommonTest {
    @Test
    public void asdas() {
        A a = new A();
        a.setTime(LocalDateTime.now());
        a.setDate(new Date());
        System.out.println(JSON.toJSONString(a));
    }
}

class A {
    private String name;
    private String password;
    private LocalDateTime time;
    private Date date;

    public A() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
