/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.service.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.afzal.MyDemoApp.service.model.Student;

@Component
public class StudentRepository {
	public List<Student> findAll() {
		List<Student> studentList = Arrays.asList(//
				Student.builder().name("Afzal").address("afzal address").build(), //
				Student.builder().name("Shabaz").address("shabaz address").build()//
		);
		return studentList;
	}
}
