package cn.wanli.auth.persistence;

import cn.wanli.auth.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

/**
 * @author wanli
 */
@Mapper
public interface AccountMapper {
    /**
     * 新增一个账号
     *
     * @param account 需要新增的账号
     * @return
     */
    Integer save(Account account);

    /**
     * 更新账号
     *
     * @param account 需要被更新的账号
     * @return
     */
    Integer update(Account account);

    /**
     * 根据id删除账号
     *
     * @param id 账号id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 根据id查找账号
     *
     * @param id 账号id
     * @return
     */
    Optional<Account> findById(Long id);

    /**
     * 根据账户名来查找账户
     *
     * @param name
     * @return
     */
    Optional<Account> findByName(String name);
}
