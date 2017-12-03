package com.ssm.dao.form;

import com.ssm.entity.Appointment;

/**
 * Created by jinyixin on 2017/11/28
 */
public class AppointmentForm extends Appointment {
  private String holdDay;

  public String getHoldDay() {
    return holdDay;
  }

  public void setHoldDay(String holdDay) {
    this.holdDay = holdDay;
  }

  @Override
  public String toString() {
    return "AppointmentForm{" +
        "holdDay='" + holdDay + '\'' +
        '}';
  }
}
