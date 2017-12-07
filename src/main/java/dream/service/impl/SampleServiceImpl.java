package dream.service.impl;


import dream.dao.UserDAO;
import dream.entity.User;
import dream.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Sample class
 *
 * @author wangxu13798
 * @date 2017/12/6
 */
@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private StringRedisTemplate redisTemplate;
//    @Autowired
//    private UserMapper userMapper;

    @Autowired
    private UserDAO userDAO;
    @Override
    public User getName() {
        User user = new User();
        List<User> list = userDAO.getAll();
        user.setUserName("wx");
        user.setUserAge(24);
        user.setUserId(1);
        user.setCreateTime(System.currentTimeMillis());
        return user;
    }
}
