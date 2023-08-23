package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Records")
public class Employee {
	
	@Id
	public int E_Id;
	public String E_Name;
	public int Salary;
	
	//Generating Constructors, Setters&Getters, ...
	public int getE_Id() {
		return E_Id;
	}
	
	public void setE_Id(int e_Id) {
		E_Id = e_Id;
	}
	public String getE_Name() {
		return E_Name;
	}
	public void setE_Name(String e_Name) {
		E_Name = e_Name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [E_Id=" + E_Id + ", E_Name=" + E_Name + ", Salary=" + Salary + "]";
	}
	public Employee(int e_Id, String e_Name, int salary) {
		super();
		E_Id = e_Id;
		E_Name = e_Name;
		Salary = salary;
	}
	public Employee() {
		super();
	}

}
