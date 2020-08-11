package com.justin.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.justin.jpa.model.Employee;

@Repository
public interface EmployeeDaoJpa extends JpaRepository<Employee, Integer>{

}
