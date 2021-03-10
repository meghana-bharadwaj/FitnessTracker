package com.track.repository;

import java.util.List;

import com.track.model.Goal;

public interface GoalRespository {
	
	Goal save(Goal goal);

	List<Goal> loadAll();

}
