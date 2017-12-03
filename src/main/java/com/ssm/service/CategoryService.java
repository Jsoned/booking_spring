package com.ssm.service;

import com.ssm.entity.Category;
import com.ssm.util.Page;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/21.
 */
public interface CategoryService {

    List<Category> list();

    void delete(Category c);   // int total();
   // List<Category> list(Page page);
  //   int add(Category category);

  //  public int add(Category category);

    void addTwo();
   // void get(Category c);
    void deleteAll();
    void add(Category c);
    Category get(int id);


}
