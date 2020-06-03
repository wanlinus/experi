package cn.wanli.auth.domain;

import cn.wanli.auth.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements Serializable {
    private Long id;
    private String name;
    private String password;
    private String email;
    private Integer age;
    private Gender gender;
    private LocalDateTime createdTime;
}
