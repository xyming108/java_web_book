package lib.dao.impl;

import lib.dao.OrderItemDao;
import lib.pojo.Order;
import lib.pojo.OrderItem;

/**
 * @user: Hasee
 * @date: 2021/2/4 21:01
 * @author: 1931559710@qq.com
 * ClassName: OrderItemDaoImpl
 * Description:
 */
public class OrderItemDaoImpl extends BaseDao implements OrderItemDao {
    @Override
    public int saveOrderItem(OrderItem orderItem) {
        String sql = "insert into t_order_item(`name`, `count`, `price`, `total_price`, `order_id`) values(?, ?, ?, ?, ?)";
        return update(sql, orderItem.getName(), orderItem.getCount(), orderItem.getPrice(), orderItem.getTotalPrice(), orderItem.getOrderId());
    }
}
