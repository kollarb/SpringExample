package com.java.springframework;

import com.java.springframework.models.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee emp);
	public void getEmployee(int id);
}
