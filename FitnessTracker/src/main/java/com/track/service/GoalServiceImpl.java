package com.track.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.track.model.Goal;
import com.track.repository.GoalRespository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	private GoalRespository goalRespository;
	
	@Transactional
	public Goal save(Goal goal) {
		return goalRespository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRespository.loadAll();
	}

}
