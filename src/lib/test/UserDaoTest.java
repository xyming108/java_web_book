package lib.test;

import lib.dao.UserDao;
import lib.dao.impl.UserDaoImpl;
import lib.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @user: Hasee
 * @date: 2021/1/20 17:36
 * @author: 1931559710@qq.com
 * ClassName: UserDaoTest
 * Description:
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUserName() {
        if (userDao.queryUserByUserName("admin") == null) {
            System.out.println("用户名可用");
        } else {
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUserNameAndPassword() {
        if (userDao.queryUserByUserNameAndPassword("admin", "admin") == null) {
            System.out.println("用户名或密码错误，失败");
        } else {
            System.out.println("成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null, "wzg", "123456", "wzg@qq.com")));
    }
}