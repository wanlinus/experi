package cn.wanli.dixit.service;

import cn.wanli.common.vo.PageReq;
import cn.wanli.dixit.domain.Dixit;
import org.springframework.data.domain.Page;

/**
 * @author wanli
 */
public interface DixitService {

    Dixit save(Dixit dixit);

    Page<Dixit> get(PageReq pageReq);
}
