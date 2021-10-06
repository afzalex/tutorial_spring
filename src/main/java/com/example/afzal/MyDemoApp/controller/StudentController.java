/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.afzal.MyDemoApp.service.StudentService;
import com.example.afzal.MyDemoApp.service.entity.Student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
@RequestMapping("/students")
public class StudentController {

	private final StudentService studentServiceImpl;

	@GetMapping("/list")
	public ResponseEntity<List<Student>> getStudentList(
			@RequestParam(value = "startsWith", required = false) String startsWith) {
		try {
			return ResponseEntity.ok(studentServiceImpl.listStudents(startsWith));
		} catch (RuntimeException re) {
			log.error("Some Error occurred : {}", re);
			return ResponseEntity.badRequest().build();
		}
	}
}
