package lib.service;

import lib.pojo.Cart;

/**
 * @user: Hasee
 * @date: 2021/2/4 17:56
 * @author: 1931559710@qq.com
 * ClassName: OrderService
 * Description:
 */
public interface OrderService {

    public String createOrder(Cart cart, Integer userId);
}
