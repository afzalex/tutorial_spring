/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.service.model;

import java.util.UUID;

import com.example.afzal.MyDemoApp.service.model.Student.StudentBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {

	private final String id = UUID.randomUUID().toString();

	private final String name;
	private final String address;

	public static StudentBuilder builder() {
		StudentBuilder sb = new StudentBuilder();
		return sb;
	}

	public static class StudentBuilder {

		private String name;
		private String address;

		private StudentBuilder() {
		}

		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public Student build() {
			Student s = new Student(name, address);
			return s;
		}

	}

}
