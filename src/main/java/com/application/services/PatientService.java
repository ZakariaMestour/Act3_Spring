package com.application.services;

import com.application.entities.Patient;
import com.application.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;

    public List<Patient> getAllPatients() {
        return patientRepo.findAll();
    }

}
