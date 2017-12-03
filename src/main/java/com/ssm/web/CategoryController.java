package com.ssm.web;




import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.entity.Category;
import com.ssm.service.CategoryService;

import com.ssm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by jinyixin on 2017/11/22.
 */


@Controller
@RequestMapping("/cate")
public class CategoryController {



    @Autowired
    private CategoryService categoryService;

    @RequestMapping("listCategory")
    public ModelAndView listCategory(Page page){
        ModelAndView mav = new ModelAndView();


        PageHelper.startPage(page.getStart(),5);
      /*  List<Category> cs= categoryService.list();

        PageInfo<Category> total=new PageInfo<Category>(cs);
*/

        List<Category> cs= categoryService.list();
        int total = (int) new PageInfo<>(cs).getTotal();

        page.caculateLast(total);

        // 放入转发参数
        mav.addObject("cs", cs);

        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;

    }


    @RequestMapping("deleteCategory")
  // @Transactional(propagation= Propagation.REQUIRED,rollbackForClassName="Exception")
    public ModelAndView deleteCategory(Category category){
        categoryService.delete(category);
        ModelAndView mav = new ModelAndView("redirect:/cate/listCategory");
        return mav;
    }


    @RequestMapping("addCategory")
    public ModelAndView addCategory(Category category){
        categoryService.add(category);
        ModelAndView mav = new ModelAndView("redirect:/cate/listCategory");
        return mav;
    }

    @RequestMapping("editCategory")
    public ModelAndView editCategory(Category category){
        Category c= categoryService.get(category.getId());
        ModelAndView mav = new ModelAndView("/cate/editCategory");
        mav.addObject("c", c);
        return mav;
    }





}




