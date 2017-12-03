package com.ssm.test;

import com.ssm.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jinyixin on 2017/11/27.
 */


public class test extends BaseTest {


    @Autowired
    private CategoryService categoryService;

    @Test
    public void testAddTwo() {
       // categoryService.deleteAll();
        categoryService.addTwo();

    }

}