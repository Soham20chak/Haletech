package haletechbackend.controllers;


import haletechbackend.entities.Doctor;
import haletechbackend.entities.Patient;
import haletechbackend.exceptions.ResourseNotFoundException;
import haletechbackend.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @CrossOrigin("http://localhost:4200/")
    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable String id){
        Patient patient = patientRepository.findById(id).orElseThrow(()-> new ResourseNotFoundException("Patient does not exist"));
        return ResponseEntity.ok(patient);
    }

    @CrossOrigin("http://localhost:4200/")
    @PutMapping("/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable String id , @RequestBody Patient patientDetails){
        Patient patient = patientRepository.findById(id).orElseThrow(()-> new ResourseNotFoundException("Patient does not exist"));
        patient.setName(patientDetails.getName());
        patient.setDesc(patientDetails.getDesc());
        patient.setPhoneno(patientDetails.getPhoneno());
        patient.setAge(patientDetails.getAge());
        patient.setGender(patientDetails.getGender());
        patient.setAppointment_date(patientDetails.getAppointment_date());
        patient.setDoctor(patientDetails.getDoctor());

        Patient updatedPatient = patientRepository.save(patient);
        return ResponseEntity.ok(updatedPatient);

    }
}
