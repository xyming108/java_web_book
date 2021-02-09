package lib.service;

import lib.pojo.Book;
import lib.pojo.Page;

import java.util.List;

/**
 * @user: Hasee
 * @date: 2021/1/27 12:49
 * @author: 1931559710@qq.com
 * ClassName: BookService
 * Description:
 */
public interface BookService {

    public void addBook(Book book);

    public void deleteBookById(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    Page<Book> page(int pageNo, int pageSize);

    Page<Book> pageByPrice(int pageNo, int pageSize, int min, int max);
}