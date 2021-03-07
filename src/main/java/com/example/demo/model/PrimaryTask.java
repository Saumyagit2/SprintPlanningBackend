package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "primarytask")
public class PrimaryTask {
    
	@Id
	private int task_id;
	private String task_name;
	private String description;
	
	
	public PrimaryTask() {}


	public PrimaryTask(int task_id, String task_name, String description) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
		this.description = description;
	}


	public int getTask_id() {
		return task_id;
	}


	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}


	public String getTask_name() {
		return task_name;
	}


	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
