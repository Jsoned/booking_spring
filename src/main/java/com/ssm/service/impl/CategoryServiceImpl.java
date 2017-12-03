package com.ssm.service.impl;

import com.ssm.dao.CategoryMapper;
import com.ssm.entity.Category;
import com.ssm.service.CategoryService;
import com.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/21.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;



   /* @Override
    public List<Category> list() {
        return categoryMapper.selectByExample();
    }*/

    @Override
    public List<Category> list() {
        // TODO Auto-generated method stub
        return categoryMapper.list();
    }

    @Override
    public void delete(Category c) {
        categoryMapper.delete(c.getId());
    }

    @Override
    public void addTwo() {

        Category c1=new Category();
        c1.setName("short name");
        categoryMapper.add(c1);

        Category c2 = new Category();
        c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
        categoryMapper.add(c2);

    }



    @Override
    public void deleteAll() {
    List<Category> cs=list();
        for(Category c:cs){
            categoryMapper.delete(c.getId());
        }
    }

    @Override
    public void add(Category c) {
          categoryMapper.add(c);

    }

    @Override
    public Category get(int id) {
        // TODO Auto-generated method stub
        return categoryMapper.get(id);
    }

   /* @Override
    public int add(Category category) {
        return categoryMapper.add(category);
    }

 *//*   @Override
    public int add(Category category) {
        return categoryMapper.add(category);
    }*//*

    @Override
    public int total() {
        return categoryMapper.total();
    };
*/


}
