package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.PrimaryTask;

public interface PrimaryTaskRepo  extends CrudRepository<PrimaryTask,Integer>{

//	public Iterable<PrimaryTask> deleteByTask_id(int task_id);
	
	public Iterable<PrimaryTask> deleteByTaskId(int taskId);
	
}
