/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.afzal.MyDemoApp.service.model.StudentModel;

@Component
public class StudentModelRepository {
	public List<StudentModel> findAll() {
		List<StudentModel> studentList = Arrays.asList(//
				StudentModel.builder().name("Afzal").address("afzal address").build(), //
				StudentModel.builder().name("Shabaz").address("shabaz address").build()//
		);
		return studentList;
	}
}
