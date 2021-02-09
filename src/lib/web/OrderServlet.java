package lib.web;

import lib.pojo.Cart;
import lib.pojo.User;
import lib.service.OrderService;
import lib.service.impl.OrderServiceImpl;
import lib.utils.jdbcUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @user: Hasee
 * @date: 2021/2/4 17:31
 * @author: 1931559710@qq.com
 * ClassName: OrderServlet
 * Description:
 */
public class OrderServlet extends BaseServlet {

    private OrderService orderService = new OrderServiceImpl();

    /**
     * 生成订单
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先获取Cart购物车对象
        Cart cart = (Cart) req.getSession().getAttribute("cart");
        //获取UserId
        User loginUser = (User) req.getSession().getAttribute("user");
        if (loginUser == null) {
            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
            return;
        }
        Integer userId = loginUser.getId();
        //调用orderService.createOrder(Cart, UserId);生成订单
        String orderId = orderService.createOrder(cart, userId);
//        req.setAttribute("orderId", orderId);
        //请求转发到/pages/cart/checkout.jsp，会出现重复提交问题
//        req.getRequestDispatcher("/pages/cart/checkout.jsp").forward(req, resp);

        //使用重定向避免重复提交
        req.getSession().setAttribute("orderId", orderId);
        resp.sendRedirect(req.getContextPath() + "/pages/cart/checkout.jsp");
    }
}
