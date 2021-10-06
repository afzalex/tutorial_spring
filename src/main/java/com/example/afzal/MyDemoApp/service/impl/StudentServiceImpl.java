/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.afzal.MyDemoApp.service.StudentService;
import com.example.afzal.MyDemoApp.service.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<String> listStudents(String startsWith) {
		log.info("Received request in service layer with param {}", startsWith);
		return studentRepository.findAll();
	}
}
