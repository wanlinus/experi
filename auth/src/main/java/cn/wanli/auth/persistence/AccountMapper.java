package cn.wanli.auth.persistence;

import cn.wanli.auth.domain.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wanli
 */
@Mapper
public interface AccountMapper {
    int save(Account account);

    int update(Account account);

    int deleteById(Long id);

    Account findById(Long id);
}
