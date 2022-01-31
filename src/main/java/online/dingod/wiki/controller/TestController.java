package online.dingod.wiki.controller;

import online.dingod.wiki.domain.Test;
import online.dingod.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping  ("/hello")
    public String Hello() {
        return "Hello World111";
    }

    @GetMapping("/test/list")
    public List<Test> List() {
        return testService.list();
    }
}
