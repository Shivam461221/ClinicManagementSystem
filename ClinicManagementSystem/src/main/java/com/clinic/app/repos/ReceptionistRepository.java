package com.clinic.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinic.app.entities.Receptionist;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Integer> {

}
