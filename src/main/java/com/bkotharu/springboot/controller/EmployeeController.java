package com.bkotharu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bkotharu.springboot.dto.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@GetMapping("/{employeeId}")
	public Employee getEmployee() {
		return new Employee();
	}
}
