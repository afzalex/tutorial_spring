/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.afzal.MyDemoApp.service.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, String>  {

}
