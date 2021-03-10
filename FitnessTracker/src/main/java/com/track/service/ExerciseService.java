package com.track.service;

import java.util.List;

import com.track.model.Activity;
import com.track.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}