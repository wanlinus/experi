package cn.wanli.auth.service;

import cn.wanli.auth.domain.Account;
import cn.wanli.common.entity.PageRequest;

import java.util.List;
import java.util.Optional;

/**
 * 账户基本服务接口
 *
 * @author wanli
 */
public interface AccountService {

    /**
     * 添加一个账户
     *
     * @param account 需要添加的账户
     * @return
     */
    Account addAccount(Account account);


    /**
     * 根据用户名查找账户
     *
     * @param name
     * @return
     */
    Optional<Account> findByName(String name);

    List<Account> list(PageRequest req);
}
