package haletechbackend.controllers;


import haletechbackend.entities.Patient;
import haletechbackend.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/doctors")
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
}
