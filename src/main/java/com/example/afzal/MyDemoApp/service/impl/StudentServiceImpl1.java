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
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.afzal.MyDemoApp.service.StudentService;
import com.example.afzal.MyDemoApp.service.model.Student;
import com.example.afzal.MyDemoApp.service.repository.StudentRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Primary
@Slf4j
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
@Service
public class StudentServiceImpl1 implements StudentService {

	private final StudentRepository studentRepository;

	@Override
	public List<Student> listStudents(String startsWith) {
		log.info("Received request in service layer with param {}", startsWith);
		List<Student> studentList = studentRepository.findAll().stream().map(s -> {
			s.setSource(this.getClass().toString());
			return s;
		}).collect(Collectors.toList());
		return studentList;
	}
}