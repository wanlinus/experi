package cn.wanli.auth.entity.vo;


import java.io.Serializable;

/**
 * @author wanli
 */
public class AccountVo implements Serializable {

    private Long id;
    private String name;
    private String nickname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
