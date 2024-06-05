package com.clinic.app.dto;

import java.util.List;

import com.clinic.app.entities.Doctor;
import com.clinic.app.entities.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceptionistDTO {
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String password;
	private String address;
	private Doctor doctor;
	private List<Patient> patient;
	private boolean isActive;
	
}
