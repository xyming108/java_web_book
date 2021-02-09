package lib.test;

import lib.pojo.Book;
import lib.pojo.Page;
import lib.service.BookService;
import lib.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @user: Hasee
 * @date: 2021/1/27 15:07
 * @author: 1931559710@qq.com
 * ClassName: BookServiceTest
 * Description:
 */
public class BookServiceTest {
    private BookService bookService = new BookServiceImpl();

    @Test
    public void addBook() {
        bookService.addBook(new Book(null, "可见的", "水电费", new BigDecimal(654), 654, 6454, null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(23, "撒谎是", "水电费", new BigDecimal(654), 654, 6454, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void Page() {
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }

    @Test
    public void PageByPrice() {
        System.out.println(bookService.pageByPrice(1, Page.PAGE_SIZE, 10, 50));
    }
}
