package com.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jinyixin on 2017/11/28.
 */

@Controller
public class WebController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }



    @RequestMapping(value = "/staticPage")
    public ModelAndView  redirect() {
System.out.print("11145");

       ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("final");
     //   return "final";
       return modelAndView;
    }
}
