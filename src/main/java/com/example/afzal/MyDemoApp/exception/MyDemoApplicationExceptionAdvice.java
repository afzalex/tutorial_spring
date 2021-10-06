/*******************************************************************************
 * Copyright (C) Altimetrik 2020. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 ******************************************************************************/

package com.example.afzal.MyDemoApp.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.google.common.collect.ImmutableMap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class MyDemoApplicationExceptionAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public final ResponseEntity<Map<String, String>> handleFeignException(RuntimeException ex, WebRequest request) {
		log.error("Uknown Exception occurred", ex);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)//
				.body(ImmutableMap.<String, String>builder()//
						.put("reason", "Uknown")//
						.put("code", "ERROR01")//
						.build());
	}

	@ExceptionHandler(OperationUnderDevelopmentException.class)
	public final ResponseEntity<Map<String, String>> handleFeignException(OperationUnderDevelopmentException ex,
			WebRequest request) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)//
				.body(ImmutableMap.<String, String>builder()//
						.put("reason", "This endpoint is still under development")//
						.put("code", "ERROR02")//
						.build());
	}
}
