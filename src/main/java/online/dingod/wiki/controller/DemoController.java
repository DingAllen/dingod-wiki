package online.dingod.wiki.controller;

import online.dingod.wiki.domain.Demo;
import online.dingod.wiki.domain.Test;
import online.dingod.wiki.service.DemoService;
import online.dingod.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> List() {
        return demoService.list();
    }
}
