package lib.dao;

import lib.pojo.User;

/**
 * @user: Hasee
 * @date: 2021/1/20 17:03
 * @author: 1931559710@qq.com
 * ClassName: UserDao
 * Description:
 */
public interface UserDao {
    //根据用户名查询用户信息，如果返回null，说明没有这个用户，反之亦然
    public User queryUserByUserName(String username);

    //根据用户名和密码查询用户信息，如果返回null，说明没有这个用户或密码错误，反之亦然
    public User queryUserByUserNameAndPassword(String username, String password);

    //保存用户信息
    public int saveUser(User user);
}
