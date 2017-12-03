package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.entity.Book;
import com.ssm.entity.Category;
import com.ssm.service.BookService;
import com.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/10.
 */
@Service
public class BookServiceImpl implements BookService {
  @Autowired
  private BookDao bookDao;


    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList(int start, int pageNum) {
        return bookDao.queryAll(start, pageNum);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBookById(long id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int countNum() {
        return bookDao.countNum();
    }

    @Override
    public List<Book> getListPlug() {
        return bookDao.queryAllPlug();
    }




}
