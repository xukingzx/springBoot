package dream.controller;

import dream.entity.User;
import dream.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxu13798
 * @date 2017/12/6
 */
@EnableAutoConfiguration
@RestController
@ComponentScan("dream")
public class SampleController {
    @Autowired
    SampleService sampleService;

    @RequestMapping("/")
    @ResponseBody
    public User home() {
        return sampleService.getName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
