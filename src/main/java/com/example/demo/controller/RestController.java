package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Employee;
import com.example.demo.model.PrimaryTask;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PrimaryTaskService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private PrimaryTaskService primaryTaskService;
	
	
	@PostMapping("/save")
	@Transactional
	@CrossOrigin
	public String registerEmployee(@RequestBody Employee emp){
	    service.SaveEmployee(emp);	
		return "Hello"+ emp.getUsername()+"you are signed in"; 
	}
	
    @GetMapping("/all-Employees")
    public Iterable<Employee> showAllEmployees(){
    	return service.showAllEmp();
    }
    
    @PostMapping("/addPrimary")
    @Transactional
    public String addPrimaryTask(@RequestBody PrimaryTask task)
    {
    	primaryTaskService.savePrimaryTask(task);
    	return "task "+task.getTask_name()+"is created";
    }
    
    @GetMapping("/search/{email}")
    @Transactional
    @CrossOrigin
    public Employee searchEmployee(@PathVariable String email)
    {
    	return service.findByUsername(email);
    }
    
}
