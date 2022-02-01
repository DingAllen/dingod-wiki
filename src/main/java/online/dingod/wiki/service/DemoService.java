package online.dingod.wiki.service;

import online.dingod.wiki.domain.Demo;
import online.dingod.wiki.domain.Test;
import online.dingod.wiki.mapper.DemoMapper;
import online.dingod.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
