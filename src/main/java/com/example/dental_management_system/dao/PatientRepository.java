package com.example.dental_management_system.dao;

import com.example.dental_management_system.pojo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
