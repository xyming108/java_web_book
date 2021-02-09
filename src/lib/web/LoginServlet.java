/*
package lib.web;

import lib.pojo.User;
import lib.service.UserService;
import lib.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*/
/**
 * @user: Hasee
 * @date: 2021/1/21 14:30
 * @author: 1931559710@qq.com
 * ClassName: LoginServlet
 * Description:
 *//*


public class LoginServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User loginUser = userService.login(new User(null, username, password, null));

        //如果等于null，说明登录失败
        if (loginUser == null) {
            //把错误信息和回显的表单项信息保存到request域中
            req.setAttribute("msg", "用户名或密码错误");
            req.setAttribute("username", username);
            //跳回登录界面
            req.getRequestDispatcher("pages/user/login.jsp").forward(req, resp);
        } else {
            //登陆成功
            //跳到成功界面
            req.getRequestDispatcher("pages/user/login_success.jsp").forward(req, resp);
        }
    }
}
*/
