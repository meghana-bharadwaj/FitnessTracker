package com.track.service;

import java.util.List;

import com.track.model.Goal;

public interface GoalService {
	
	Goal save(Goal goal);

	List<Goal> findAllGoals();
}
