package com.justin.jpa.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.justin.jpa.dao.EmployeeDao;
import com.justin.jpa.dao.EmployeeDaoJpa;
import com.justin.jpa.model.Employee;
import com.justin.jpa.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private EmployeeDaoJpa dao2;

	@Override
	public void insert(Employee employee) {
		employeeDao.insert(employee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int empno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee findByPK(int empno) {
		return employeeDao.findByPK(empno);
	}

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

}
