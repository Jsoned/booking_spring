package com.ssm.service;

import com.ssm.entity.Book;
import com.ssm.entity.Category;
import com.ssm.util.Page;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/10.
 */
public interface BookService {

    Book getById(long bookId);
    List<Book> getList(int start, int pageNum);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(long id);
    int countNum();

    List<Book> getListPlug();





}
