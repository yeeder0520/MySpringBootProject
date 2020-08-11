package com.justin.jpa.dao;

import java.util.List;

import com.justin.jpa.model.Employee;

public interface EmployeeDao  {
	void insert(Employee employee);
	void update(Employee employee);
	void delete(int empno);
	Employee findByPK(int empno);
	List<Employee> getAll();
}
