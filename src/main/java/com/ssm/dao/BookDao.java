package com.ssm.dao;

import com.ssm.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/10.
 */
public interface BookDao {

    Book queryById(long id);
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(long id);
    int countNum();
    List<Book> queryAllPlug();


}
