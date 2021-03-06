/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.service;

import java.util.List;

import com.example.afzal.MyDemoApp.service.entity.StudentEntity;
import com.example.afzal.MyDemoApp.service.model.StudentModel;

public interface StudentService {

	List<StudentEntity> listStudents(String startsWith);

	StudentModel createStudent(StudentModel studentObj);

}
