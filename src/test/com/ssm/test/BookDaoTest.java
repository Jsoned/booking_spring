package com.ssm.test;

import com.ssm.dao.BookDao;
import com.ssm.entity.Book;
import java.util.List;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jinyixin on 2017/11/30
 */
public class BookDaoTest extends BaseTest {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private BookDao bookDao;

  @Test
  public void addBook() {
    for (int i = 0; i < 20; i++) {
      Book book = new Book();
      book.setDetail("描述" + i);
      book.setName("活着" + i);
      book.setNumber(i + 100);
      int num = bookDao.addBook(book);
    }
  }

  @Test
  public void queryById() {
    Book book = bookDao.queryById(101);
    System.out.println(book);
  }

  @Test
  public void queryAll() {
    List<Book> books = bookDao.queryAll(1, 1000);
    System.out.println(books);
  }

  @Test
  public void updateBook() {
    Book book = new Book();
    book.setBookId(105);
    book.setDetail("描述---修改");
    book.setName("活着---修改");
    book.setNumber(100);
    int num = bookDao.updateBook(book);
  }

  @Test
  public void deleteBookById() {
    bookDao.deleteBookById(100);
  }
}
