package com.justin.jpa.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="EMPNO")
	private int empno;
	@Column(name="ENAME")
	private String ename;
	@Column(name="JOB")
	private String job;
	@Column(name="HIREDATE")
	private Date hiredate;
	@Column(name="SAL")
	private double sal;
	@Column(name="COMM")
	private double comm;
	@Column(name="DEPTNO")
	private int deptno;

	public Employee() {
	}

	public Employee(int empno, String ename, String job, Date hiredate, double sal, double comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return   "empno=" + empno  
				+", ename=" + ename 
				+", job="   + job 
				+", hiredate=" + hiredate 
				+", sal="   + sal 
				+", comm="  + comm 
				+", deptno=" + deptno;
	}

}
