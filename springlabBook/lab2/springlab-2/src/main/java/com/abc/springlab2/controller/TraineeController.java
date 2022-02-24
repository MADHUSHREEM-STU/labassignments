package com.abc.springlab2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.springlab2.entity.Trainee;
import com.abc.springlab2.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	private TraineeService traineeService;
	
	@PostMapping("/save")
	public void addTrainee(@RequestBody Trainee trainee) {
		traineeService.saveTrainee(trainee);
	}

	@GetMapping("/all")
	public List<Trainee> fetchAllTrainees() {
		
		List<Trainee> trainees =traineeService.getAllTrainees();
		
		return trainees;
	}

	@GetMapping("/get/{pid}")
	public ResponseEntity<?> fetchTraineeDetails(@PathVariable("pid") int traineeId) {
		Trainee trainee = traineeService.getTraineeById(traineeId);
		return new ResponseEntity<>(trainee, HttpStatus.OK);
	}


	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<?> deleteTrainee(@PathVariable("pid") int traineeId) {
		traineeService.deleteTrainee(traineeId);
		return new ResponseEntity<>("trainee Deleted with id: "+traineeId, HttpStatus.OK);
	}
	
	 
	@PutMapping("/update")
	public ResponseEntity<Trainee> modifyTrainee(@RequestBody Trainee trainee) {
		Trainee updatedTrainee = traineeService.updateTrainee(trainee);
		return new ResponseEntity<>(updatedTrainee, HttpStatus.OK);
	}
	
	@GetMapping("/name/{traineeName}")
	public ResponseEntity<List<Trainee>> fetchTraineeDetailsByTraineeName(@PathVariable("traineeName") String traineeName) {
		List<Trainee> trainees = traineeService.getTraineeByTraineeName(traineeName);
		return new ResponseEntity<>(trainees, HttpStatus.OK);
	}
	

}