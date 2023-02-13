package com.project.app.Rest.Model;

import jakarta.persistence.*;
@Entity
public class Patient 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int patient_id;
	@Column
	private String patient_Fname;
	@Column
	private String patient_Lname;
	@Column
	private int age;
	@Column
	private String disease;
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPatient_Lname() {
		return patient_Lname;
	}
	public void setPatient_Lname(String patient_Lname) {
		this.patient_Lname = patient_Lname;
	}
	public String getPatient_Fname() {
		return patient_Fname; 
	}
	public void setPatient_Fname(String patient_Fname) {
		this.patient_Fname = patient_Fname;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
}