package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subtask")
public class SubTask {
    
	@Id
	private int subtaskId;
	private String subtaskName;
	private String description;
	private int employeeId;
	private String startDate;
	private String endDate;
	private int estimatedHours;
	private int creatorId;
	private int modifierId;
	
	
	
	public SubTask() {}



	public SubTask(int subtaskId, String subtaskName, String description, int employeeId, String startDate,
			String endDate, int estimatedHours, int creatorId, int modifierId) {
		super();
		this.subtaskId = subtaskId;
		this.subtaskName = subtaskName;
		this.description = description;
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.estimatedHours = estimatedHours;
		this.creatorId = creatorId;
		this.modifierId = modifierId;
	}



	public int getSubtaskId() {
		return subtaskId;
	}



	public void setSubtaskId(int subtaskId) {
		this.subtaskId = subtaskId;
	}



	public String getSubtaskName() {
		return subtaskName;
	}



	public void setSubtaskName(String subtaskName) {
		this.subtaskName = subtaskName;
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
