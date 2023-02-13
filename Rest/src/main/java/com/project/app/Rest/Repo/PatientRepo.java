package com.project.app.Rest.Repo;

import com.project.app.Rest.Model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepo extends JpaRepository<Patient,Long>{
	

}
