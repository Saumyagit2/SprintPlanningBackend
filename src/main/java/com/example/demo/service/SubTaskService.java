package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.SubTaskRepo;

import com.example.demo.model.SubTask;

@Service
public class SubTaskService {
 
	
	@Autowired
	private SubTaskRepo repo;
	
	public SubTaskService() {}

	public SubTaskService(SubTaskRepo repo) {
		super();
		this.repo = repo;
	}
	
	public void saveSubTask(SubTask task)
	{
		repo.save(task);
	}
	 public Iterable<SubTask> showAllSubTasks()
	    {
	    	return repo.findAll();
	    }
//	 public Iterable<PrimaryTask> deleteByTask_id(int task_id)
//	    {
//	    	repo.deleteByTask_id(task_id);
//	    	return repo.findAll();
//	    }

//	 public Iterable<SubTask> deleteBytaskid(int subtaskId)
//	    {
//	    	repo.deleteByTaskId(subtaskId);
//	    	return repo.findAll();
//	    }
	 
}
