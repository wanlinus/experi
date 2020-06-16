package cn.wanli.auth.service;

import cn.wanli.auth.domain.Account;

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


    Account findByUsername(String username);

}
