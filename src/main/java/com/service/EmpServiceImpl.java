package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.EmployeeRepo;
import com.model.Employee;
@Service
public class EmpServiceImpl implements EmpService {
@Autowired
EmployeeRepo er;
	
	public Employee add(Employee e) {
		return er.save(e);
	}

	public List<Employee> get() {
		return er.findAll();
	}

	
	public Employee savedata(Employee e) {
		return er.save(e);
	}

	public void deletedata(int id) {
		er.deleteById(id);
	}

}
