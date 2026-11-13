package org.example.patientmanagement.Services;

import org.example.patientmanagement.DTO.DoctorRequestDto;
import org.example.patientmanagement.DTO.DoctorResponseDto;
import org.example.patientmanagement.Model.Doctor;
import org.example.patientmanagement.Repositories.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;
    public DoctorService(DoctorRepository doctorRepository , DoctorMapper doctorMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorMapper = doctorMapper;
    }

    public DoctorResponseDto addDoctor(DoctorRequestDto requestDto) {

        Doctor doctor = doctorMapper.toEntity(requestDto);
       doctorRepository.save(doctor);
        DoctorResponseDto responseDto = new DoctorResponseDto(doctor.getFullName(), "Doctor added successfully");
        return responseDto ;
    }
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    public Doctor getDoctorById(int id) {
        return doctorRepository.findById(id).orElseThrow(()-> new RuntimeException("Doctor not found"));
    }
    public List<Doctor> getDoctorByClinic(String clinic) {
        return doctorRepository.findAllByClinic(clinic);
    }
}
