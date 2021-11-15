package cn.wanli.dixit.service;

import cn.wanli.common.vo.PageReq;
import cn.wanli.dixit.domain.Dixit;
import cn.wanli.dixit.persistence.DixitRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DixitServiceImpl implements DixitService {

    @Resource
    private DixitRepository dixitRepository;

    @Override
    public Dixit save(Dixit dixit) {
        return dixitRepository.save(dixit);
    }

    @Override
    public Page<Dixit> get(PageReq request) {
        PageRequest pageReq = PageRequest.of(request.getPage(), request.getSize());
        return dixitRepository.findAll(pageReq);
    }
}
