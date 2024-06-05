package com.clinic.app.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Receptionist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	private String email;
	private String password;
	private String address;
	
	@ManyToOne()
	@JoinColumn(name = "doctor")
	private Doctor doctor;
	
	@OneToMany(mappedBy = "receptionistId")
	private List<Patient> patient;
	
	@Column(name="is_active")
	private boolean isActive;
	
	private Date createdAt;
	private Date updatedAt;

}
