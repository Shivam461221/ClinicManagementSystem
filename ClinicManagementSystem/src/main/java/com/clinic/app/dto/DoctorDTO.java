package com.clinic.app.dto;

import java.sql.Date;
import java.util.List;

import com.clinic.app.entities.Receptionist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
	private int id;
	private List<Receptionist> receptionist;
	private String name;
	private String phoneNumber;
	private String email;
	private String password;
	
}
