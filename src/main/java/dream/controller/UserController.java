package dream.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxu13798
 * @date 2017/12/6
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser() {
        return "wx";
    }
}
