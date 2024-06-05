package com.clinic.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.app.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
