package com.abc.springlab2.service;

import java.util.List;

import com.abc.springlab2.entity.Trainee;

public interface TraineeService {
	
	public void saveTrainee(Trainee trainee);

	public List<Trainee> getAllTrainees();

	public Trainee getTraineeById(int traineeId);

	public Trainee updateTrainee(Trainee trainee);

	public void deleteTrainee(int traineeId);

	public List<Trainee> getTraineeByTraineeName(String traineeName);

}
