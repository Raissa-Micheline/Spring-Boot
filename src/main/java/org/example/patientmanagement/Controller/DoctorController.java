package org.example.patientmanagement.Controller;

import jakarta.validation.Valid;
import org.example.patientmanagement.DTO.DoctorRequestDto;
import org.example.patientmanagement.DTO.DoctorResponseDto;
import org.example.patientmanagement.Model.Doctor;
import org.example.patientmanagement.Repositories.DoctorRepository;
import org.example.patientmanagement.Services.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    private DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DoctorResponseDto> addDoctor(@Valid @RequestBody DoctorRequestDto doctor) {

        return new ResponseEntity<>(service.addDoctor(doctor), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return service.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id) {
        return service.getDoctorById(id);
    }
    @GetMapping("/clinic")
    public List<Doctor> getDoctorByClinic(@RequestParam String clinic) {
        return service.getDoctorByClinic(clinic);
    }
}
