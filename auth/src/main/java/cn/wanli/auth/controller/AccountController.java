package cn.wanli.auth.controller;

import cn.wanli.auth.domain.Account;
import cn.wanli.auth.service.AccountService;
import cn.wanli.common.entity.PageRequest;
import cn.wanli.common.entity.ServerResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static cn.wanli.common.utils.ReturnUtils.success;

/**
 * @author wanli
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping
    public ServerResp<List<Account>> account(PageRequest req) {
        List<Account> list = accountService.list(req);
        return success(list);
    }


}
