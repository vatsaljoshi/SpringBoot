package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeDao;
import com.app.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao edao;
	
	//CREATE
	public String addEmployee(Employee employee) {
		edao.save(employee);
		return "An employee added to the database";
	}
	
	//READ
	public Optional<Employee> getEmployee(int id){
		return edao.findById(id);
	}
	
	//UPDATE
	public String updateEmployee(Employee employee) {
		edao.save(employee);
		return "A employee's record has been updated "+employee.getE_Id();
	}
	
	//DELETE
	public String deleteEmployee(int id) {
		Employee employee = edao.getReferenceById(id);
		edao.delete(employee);
		return "A Employee has been deleted with id: "+id;
	}
}
