package cn.wanli.dixit.controller;

import cn.wanli.common.utils.ReturnUtils;
import cn.wanli.common.vo.PageReq;
import cn.wanli.common.vo.ServerResp;
import cn.wanli.dixit.domain.Dixit;
import cn.wanli.dixit.service.DixitService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wanli
 */
@RestController
@RequestMapping("/dixit")
public class DixitController {

    @Resource
    private DixitService dixitService;

    @GetMapping("/")
    public ServerResp<Page<Dixit>> getDixit(PageReq pageReq) {
        Page<Dixit> page = dixitService.get(pageReq);
        return ReturnUtils.success(page);
    }

    @PostMapping("/")
    public void saveDixit() {

    }


}
