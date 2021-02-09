package lib.test;

import lib.dao.OrderItemDao;
import lib.dao.impl.OrderItemDaoImpl;
import lib.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @user: Hasee
 * @date: 2021/2/4 23:01
 * @author: 1931559710@qq.com
 * ClassName: OrderItemDaoTest
 * Description:
 */
public class OrderItemDaoTest {
    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null, "Java从入门到精通", 1, new BigDecimal(100), new BigDecimal(100), "1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null, "JavaScript从入门到精通", 2, new BigDecimal(100), new BigDecimal(200), "1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null, "mysql从入门到精通", 1, new BigDecimal(100), new BigDecimal(100), "1234567890"));

    }

}