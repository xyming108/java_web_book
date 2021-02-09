package lib.test;

import lib.dao.BookDao;
import lib.dao.impl.BookDaoImpl;
import lib.pojo.Book;
import lib.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @user: Hasee
 * @date: 2021/1/27 12:14
 * @author: 1931559710@qq.com
 * ClassName: BookDaoTest
 * Description:
 */
public class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBook() {
        bookDao.addBook(new Book(21, "哈哈哈", "对方水电费", new BigDecimal(9999), 1100, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void udateBook() {
        bookDao.updateBook(new Book(22, "噗噗噗", "对方水电费", new BigDecimal(9999), 1100, 0, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(10, 50));
    }

    @Test
    public void queryForPageItemsByPrice() {
        for (Book book : bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE, 10, 50)) {
            System.out.println(book);
        }
    }
}
