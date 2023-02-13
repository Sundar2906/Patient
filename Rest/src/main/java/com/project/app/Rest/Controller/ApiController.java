package com.project.app.Rest.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.Rest.Model.Patient;
import com.project.app.Rest.Repo.PatientRepo;

@RestController
public class ApiController{
	
	@Autowired
	public PatientRepo patientRepo;
	@GetMapping("/")
	public String abc()
	{
		return "Bro Vanakam!!!!";
	}
	@GetMapping("/users")
	public List<Patient> getUsers()
	{
		return patientRepo.findAll();
	}
	@PostMapping("/save")
	public String saveUser( @RequestBody Patient user)
	{
		patientRepo.save(user);
		return "Saved...";
	}
	
	@PutMapping("update/{id}")
	public String updateUser( @PathVariable long id,@RequestBody Patient user)
	{
	  Patient updatedUser = patientRepo.findById(id).get();
	  updatedUser.setPatient_id(user.getPatient_id());
	  updatedUser.setPatient_Fname(user.getPatient_Fname());
	  updatedUser.setPatient_Lname(user.getPatient_Lname());
	  updatedUser.setDisease(user.getDisease());
	  updatedUser.setAge(user.getAge());
	  patientRepo.save(updatedUser);
	  return "Updated...";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id)
	{
		Patient deleteUser=patientRepo.findById(id).get();
		patientRepo.delete(deleteUser);
		return "Deleted user with the id:"+id;
	}
}