package com.ssm.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jinyixin on 2017/11/28
 */
public class TimeHandler {
  /**
   * 打印时间
   */
  public void printTime() {
    //此处准备记录运行日志
    String time = new SimpleDateFormat("yyyy-MM-dd hh24:mm:ss").format(new Date());
    System.out.println();
    System.out.println("Spring AOP >>>>> 当前时间 = " + time);
  }
}
