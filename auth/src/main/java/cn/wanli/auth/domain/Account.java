package cn.wanli.auth.domain;

import cn.wanli.auth.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 对应tb_account表, 用于记录账户信息的实体
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
