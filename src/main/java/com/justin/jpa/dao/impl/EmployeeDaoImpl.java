package com.justin.jpa.dao.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.justin.jpa.dao.EmployeeDao;
import com.justin.jpa.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE(EMPNO, ENAME, JOB, HIREDATE, SAL, COMM, DEPTNO)"
				   + "VALUES(?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql,employee.getEmpno(),employee.getEname(),employee.getJob(),employee.getHiredate(),employee.getSal(),employee.getComm(),employee.getDeptno());
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
		String sql = "SELECT * FROM EMPLOYEE WHERE EMPNO = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class),empno);
	}

	@Override
	public List<Employee> getAll() {
		String sql = "SELECT * FROM EMPLOYEE";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

}
