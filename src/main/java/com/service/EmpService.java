package com.service;

import java.util.List;

import com.model.Employee;

public interface EmpService {

	public Employee add(Employee e);

	public List<Employee> get();

	public Employee savedata(Employee e);

	public void deletedata(int id);


}
