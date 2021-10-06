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

import com.example.afzal.MyDemoApp.repository.StudentRepository;
import com.example.afzal.MyDemoApp.service.StudentService;
import com.example.afzal.MyDemoApp.service.entity.Student;
import com.example.afzal.MyDemoApp.service.model.StudentModel;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	@Override
	public List<Student> listStudents(String startsWith) {
		log.info("Received request in service layer with param {}", startsWith);
		return studentRepository.findAll();
	}

	@Override
	public StudentModel createStudent(StudentModel studentModel) {
		log.info("Request to create student object : {}", studentModel);
		Student studentEntity = new Student(); // transient object
		studentEntity.setName(studentModel.getName());
		studentEntity.setAddress(studentModel.getAddress());
		Student createdStudent = studentRepository.save(studentEntity); // now persistent object
		studentModel.setId(createdStudent.getId());
		return studentModel;
	}
}
