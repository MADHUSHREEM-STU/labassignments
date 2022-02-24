package com.abc.springlab2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.springlab2.entity.Trainee;
import com.abc.springlab2.exception.TraineeNotFoundException;
import com.abc.springlab2.repository.TraineeRepository;


@Service
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	private TraineeRepository traineeRepository;
	@Override
	public void saveTrainee(Trainee trainee) {
		traineeRepository.save(trainee);

	}
	@Override
	public List<Trainee> getAllTrainees(){
		List<Trainee> trainees = traineeRepository.findAll();
		return trainees;
	}

	@Override
	public Trainee getTraineeById(int traineeId) throws TraineeNotFoundException {

		Optional<Trainee> optionalTrainee = traineeRepository.findById(traineeId);

		if(optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("Sorry! Trainee is not existing with id: "+traineeId);
		}
		return optionalTrainee.get();		
	}
	@Override
	public Trainee updateTrainee(Trainee trainee) {

		Optional<Trainee> optionalTrainee =traineeRepository.findById(trainee.getTraineeId());

		if(optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("Sorry! Trainee is not existing with id: "+trainee.getTraineeId());
		}

		Trainee updatedTrainee= traineeRepository.save(trainee);

		return updatedTrainee;
	}

	@Override
	public void deleteTrainee(int traineeId) {

		Optional<Trainee> optionalTrainee = traineeRepository.findById(traineeId);

		if(optionalTrainee.isPresent()) {			
			traineeRepository.deleteById(traineeId);			
		}
		else {
			throw new TraineeNotFoundException("Sorry! Trainee is not existing with id: "+traineeId);
		}			
	}

	@Override
	public List<Trainee> getTraineeByTraineeName(String traineeName) {

		return traineeRepository.findTraineeByTraineeName(traineeName);
	}

}
