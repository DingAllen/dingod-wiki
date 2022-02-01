package online.dingod.wiki.controller;

import online.dingod.wiki.domain.Ebook;
import online.dingod.wiki.req.EbookReq;
import online.dingod.wiki.resp.CommonResp;
import online.dingod.wiki.resp.EbookResp;
import online.dingod.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp List(EbookReq req) {

        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
