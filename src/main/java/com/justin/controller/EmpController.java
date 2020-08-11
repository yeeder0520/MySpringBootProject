package com.justin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.justin.jpa.model.Employee;
import com.justin.jpa.service.EmployeeService;
import com.justin.jpa.service.impl.EmployeeServiceImpl;

@RestController
public class EmpController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insert(@Param("empno") int empno, @Param("ename") String ename, @Param("deptno") int deptno) {
		Employee employee = new Employee();
		employee.setEmpno(empno);
		employee.setEname(ename);
		employee.setDeptno(deptno);
		employeeService.insert(employee);
		System.out.println("insert OK!");
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String getAll() {
		List<Employee> list = employeeService.getAll();
		for (Employee lists : list) {
			System.out.println("Empno=" + lists.getEmpno());
			System.out.println("Ename=" + lists.getEname());
		}
		return list.toString();
	}

	@RequestMapping(value = "/findByPK", method = RequestMethod.GET)
	public String findByPK(@Param("empno") int empno) {
		Employee result = employeeService.findByPK(empno);
		return result.toString();
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "This is hello";
	}

}
