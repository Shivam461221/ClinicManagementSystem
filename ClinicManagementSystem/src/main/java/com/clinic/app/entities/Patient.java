package com.clinic.app.entities;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private String sex;
	
	@Column(name = "phone_number")
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
