package com.clinic.app.dto;

import java.sql.Date;
import java.sql.Time;

import com.clinic.app.entities.Doctor;
import com.clinic.app.entities.Receptionist;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PatientDTO {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String phoneNumber;
	private Date appointmentDate;
	private Time time;
	
	@ManyToOne
	@JoinColumn(name = "receptionist")
	private Receptionist receptionist;
	
	@ManyToOne
	@JoinColumn(name = "doctor")
	private Doctor doctor;
	
	@Column(name = "primary_problem")
	private String primaryProblem;
	
	@Column(name = "is_active")
	private boolean isActive;
	private Date createdAt;
	private Date updatedAt;
}
