package com.example.dental_management_system.service;
import com.example.dental_management_system.dao.PatientRepository;
import com.example.dental_management_system.pojo.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{

    private final PatientRepository PatientRepository;

    public PatientServiceImpl(PatientRepository PatientRepository) {
        this.PatientRepository = PatientRepository;
    }
    @Override
    public Patient save(Patient thePatient) {

        return PatientRepository.save(thePatient);
    }
    
   
}
