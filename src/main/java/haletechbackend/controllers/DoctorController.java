package haletechbackend.controllers;


import haletechbackend.entities.Doctor;
import haletechbackend.exceptions.ResourseNotFoundException;
import haletechbackend.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    @CrossOrigin("http://localhost:4200/")
    @PostMapping("/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorRepository.save(doctor);
    }


    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable String id){
        Doctor doctor = doctorRepository.findById(id).orElseThrow(()-> new ResourseNotFoundException("Doctor does not exist"));
        return ResponseEntity.ok(doctor);
    }
}
