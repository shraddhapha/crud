package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmpService;

@RestController
public class EmployeeController {
@Autowired
EmpService es;

@RequestMapping(value="/AddData",method=RequestMethod.POST)
public Employee add(@RequestBody Employee e) {
	Employee emp=es.add(e);
	return emp;
}
@RequestMapping(value="/getData",method=RequestMethod.GET)
public Iterable<Employee> display() {
	List<Employee>e= es.get();
	return e;
}
@RequestMapping(value="/updateData",method=RequestMethod.PUT)
public Employee updateData(@RequestBody Employee e) {
	return es.savedata(e);
}
@RequestMapping(value="/deleteData",method=RequestMethod.DELETE)
public String deletedata(@PathVariable("id")int id) {
	es.deletedata(id);
	return "succesfully deleted";
}

}
