package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "primarytask")
public class PrimaryTask {
    
	@Id
	private int taskId;
	private String taskName;
	private String description;
	private int employeeId;
	private String startDate;
	private String endDate;
	private int estimatedHours;
	private int creatorId;
	private int modifierId;
	
	
	
	public PrimaryTask() {}



	public PrimaryTask(int taskId, String taskName, String description, int employeeId, String startDate,
			String endDate, int estimatedHours, int creatorId, int modifierId) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.description = description;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.estimatedHours = estimatedHours;
		this.creatorId = creatorId;
		this.modifierId = modifierId;
	}



	public int getTaskId() {
		return taskId;
	}



	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}



	public String getTaskName() {
		return taskName;
	}



	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public int getEstimatedHours() {
		return estimatedHours;
	}



	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}



	public int getCreatorId() {
		return creatorId;
	}



	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}



	public int getModifierId() {
		return modifierId;
	}



	public void setModifierId(int modifierId) {
		this.modifierId = modifierId;
	}



	


	
	
}
