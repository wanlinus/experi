package cn.wanli.auth.service.impl;

import cn.wanli.auth.domain.Account;
import cn.wanli.auth.persistence.AccountMapper;
import cn.wanli.auth.service.AccountService;
import cn.wanli.common.entity.PageRequest;
import cn.wanli.common.utils.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author wanli
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account addAccount(Account account) {
        logger.info("新增账户:[{}]", JSON.toJSONString(account));
        accountMapper.save(account);
        return null;
    }

    @Override
    public Optional<Account> findByName(String name) {
        return accountMapper.findByName(name);
    }

    @Override
    public List<Account> list(PageRequest req) {
        int offset = (req.getPage() - 1) * req.getSize();
        return accountMapper.list(offset, req.getSize(), req.getKeyword());
    }
}
