package com.application.controllers;

import com.application.entities.Patient;
import com.application.repositories.PatientRepo;
import com.application.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class PatientController {
    @Autowired
    private PatientService patientService;
    @GetMapping("/user/patient")
    public String getAllPatients(Model model) {
        model.addAttribute("patients", patientService.getAllPatients());
        return "patient";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/user/patient";
    }


}
