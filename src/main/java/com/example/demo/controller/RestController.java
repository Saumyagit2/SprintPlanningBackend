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
import com.example.demo.model.SubTask;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.PrimaryTaskService;
import com.example.demo.service.SubTaskService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private PrimaryTaskService primaryTaskService;
	@Autowired
	private SubTaskService subtaskService;
	
	
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
    
    
    @GetMapping("/all-Tasks")
    @CrossOrigin
    public Iterable<PrimaryTask> showAllTasks(){
    	return primaryTaskService.showAllTasks();
    }
    
    @GetMapping("/all-SubTasks")
    @CrossOrigin
    public Iterable<SubTask> showAllSubTasks(){
    	return subtaskService.showAllSubTasks();
    }
    
//    @GetMapping("/delete/{task_id}")
//    @CrossOrigin
//    public Iterable<PrimaryTask> deleteTask(@PathVariable int task_id){
//    	return primaryTaskService.deleteByTask_id(task_id);
//    }
    
   @GetMapping("/delete/{taskId}")
   @Transactional
   @CrossOrigin
   public Iterable<PrimaryTask> deleteTask(@PathVariable int taskId){
    	return primaryTaskService.deleteBytaskid(taskId);
  }
  
    
    
    @PostMapping("/addPrimary")
    @Transactional
    @CrossOrigin
    public String addPrimaryTask(@RequestBody PrimaryTask task)
    {
    	primaryTaskService.savePrimaryTask(task);
    	return "task "+task.getTaskName()+"is created";
    }
    
    
    @PostMapping("/addSub")
    @Transactional
    @CrossOrigin
    public String addSubTask(@RequestBody SubTask task)
    {
    	subtaskService.saveSubTask(task);
    	return "task "+task.getSubtaskName()+"is created";
    }
    
    @GetMapping("/search/{email}")
    @Transactional
    @CrossOrigin
    public Employee searchEmployee(@PathVariable String email)
    {
    	return service.findByEmail(email);
    }
    
}
