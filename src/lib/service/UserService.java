package lib.service;

import lib.pojo.User;

/**
 * @user: Hasee
 * @date: 2021/1/20 19:42
 * @author: 1931559710@qq.com
 * ClassName: UserService
 * Description:
 */
public interface UserService {
    //注册用户
    public void registUser(User user);

    //登录
    public User login(User user);

    //检查用户名是否可用
    public boolean existsUsername(String username);
}
