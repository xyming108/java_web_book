package lib.service.impl;

import lib.dao.UserDao;
import lib.dao.impl.UserDaoImpl;
import lib.pojo.User;
import lib.service.UserService;

/**
 * @user: Hasee
 * @date: 2021/1/20 19:46
 * @author: 1931559710@qq.com
 * ClassName: UserServiceImpl
 * Description:
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUserNameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUserName(username) == null) {
            return false;
        }
        return true;
    }
}
