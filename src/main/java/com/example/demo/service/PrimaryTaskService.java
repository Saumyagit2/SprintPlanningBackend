package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PrimaryTaskRepo;
import com.example.demo.model.PrimaryTask;

@Service
public class PrimaryTaskService {
 
	
	@Autowired
	private PrimaryTaskRepo repo;
	
	public PrimaryTaskService() {}

	public PrimaryTaskService(PrimaryTaskRepo repo) {
		super();
		this.repo = repo;
	}
	
	public void savePrimaryTask(PrimaryTask task)
	{
		repo.save(task);
	}
	
}
