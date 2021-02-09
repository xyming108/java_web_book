package lib.test;

import lib.dao.OrderDao;
import lib.dao.impl.OrderDaoImpl;
import lib.pojo.Order;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @user: Hasee
 * @date: 2021/2/4 21:34
 * @author: 1931559710@qq.com
 * ClassName: OrderDaoTest
 * Description:
 */
public class OrderDaoTest {

    @Test
    public void saveOrder() {

        OrderDao orderDao = new OrderDaoImpl();
        orderDao.saveOrder(new Order("1234567891", new Date(), new BigDecimal(100), 0, 1));

    }
}