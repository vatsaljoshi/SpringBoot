package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//CREATE
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	//READ
	@GetMapping("/getOne/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return employeeService.getEmployee(id);
	}
	
	//UPDATE
	@PutMapping("update")
	public String updateEmployoee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	//DELETE
	@DeleteMapping("/deleteOne/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
}
