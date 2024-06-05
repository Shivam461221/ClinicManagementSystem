package com.clinic.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.app.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
