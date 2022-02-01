package online.dingod.wiki.service;

import online.dingod.wiki.domain.Ebook;
import online.dingod.wiki.domain.EbookExample;
import online.dingod.wiki.mapper.EbookMapper;
import online.dingod.wiki.req.EbookReq;
import online.dingod.wiki.resp.EbookResp;
import online.dingod.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;
    }
}
