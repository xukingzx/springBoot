package dream.dao;

import dream.entity.User;

import java.util.List;

/**
 * Created by ouakira on 2017/12/7.
 */
public interface UserDAO {
    List<User> getAll();
}
