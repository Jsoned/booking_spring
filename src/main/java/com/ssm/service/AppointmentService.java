package com.ssm.service;

import com.ssm.dao.form.AppointmentForm;
import com.ssm.entity.Appointment;

/**
 * Created by hisenyuan on 2017/8/2 at 10:36.
 */
public interface AppointmentService {
  int appoint(AppointmentForm record);
  int returnBook(Appointment record);
}
