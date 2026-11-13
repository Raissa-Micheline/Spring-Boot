package org.example.patientmanagement.Controller;

import org.example.patientmanagement.Model.Patient;
import org.example.patientmanagement.Services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient , @RequestParam int doctorId) {
        return service.addPatient(patient , doctorId);
    }

   @GetMapping("/all")
    public List<Patient> getAllPatient(){
        return service.getAllPatients();
    }
    @GetMapping
    public Patient getPatientById(@RequestParam int id , @RequestParam String email) {
        return service.getPatientById(id , email);
    }
//    @PutMapping
//    public Patient updatePatient(@RequestParam int id,@RequestBody Patient patient) {
//        return service.updatePatient(id,patient);
//    }
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        return service.deletePatient(id);
    }
    @DeleteMapping("/all")
    public String deleteAllPatients() {
        return service.deleteAllPatients();
    }




}
