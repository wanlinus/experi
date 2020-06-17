package cn.wanli.auth.domain;

import cn.wanli.auth.enums.Gender;
import cn.wanli.common.utils.JSON;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 对应tb_account表, 用于记录账户信息的实体
 *
 * @author wanli
 */
public class Account implements Serializable {
    private Long id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户用户性别
     */
    private Gender gender;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    public Account() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
