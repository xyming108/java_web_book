package lib.dao.impl;

import lib.dao.OrderDao;
import lib.pojo.Order;

/**
 * @user: Hasee
 * @date: 2021/2/4 20:43
 * @author: 1931559710@qq.com
 * ClassName: OrderDaoImpl
 * Description:
 */
public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {
        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";
        return update(sql, order.getOrderId(), order.getCreateTime(), order.getPrice(), order.getStatus(), order.getUserId());
    }
}
