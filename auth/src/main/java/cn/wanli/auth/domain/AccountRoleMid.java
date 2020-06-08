package cn.wanli.auth.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 账户角色中间表, 用来记录账户和角色关系实体
 *
 * @author wanli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRoleMid implements Serializable {
    private Long id;
    private Long accountId;
    private Long roleId;
    private LocalDateTime createdTime;
}
