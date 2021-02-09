package lib.test;

import lib.dao.UserDao;
import lib.pojo.User;
import lib.service.UserService;
import lib.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @user: Hasee
 * @date: 2021/1/20 20:02
 * @author: 1931559710@qq.com
 * ClassName: UserServiceImplTest
 * Description:
 */
public class UserServiceImplTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null, "asd654", "66666", "asd654qq.com"));
        userService.registUser(new User(null, "ssd654", "666666", "ssd654qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null, "asd654", "66666", "asd654qq.com")));
    }

    @Test
    public void existsUsername() {
        if (userService.existsUsername("asd65446")) {
            System.out.println("用户名已存在");
        } else {
            System.out.println("用户名可用");
        }
    }
}