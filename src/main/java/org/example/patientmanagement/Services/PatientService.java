package org.example.patientmanagement.Services;

import org.example.patientmanagement.Model.Doctor;
import org.example.patientmanagement.Model.Patient;
import org.example.patientmanagement.Repositories.DoctorRepository;
import org.example.patientmanagement.Repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public PatientService(PatientRepository patientRepository , DoctorRepository doctorRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    public Patient addPatient(Patient newPatient , int doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() -> new RuntimeException("Doctor not found") );

        Patient patient =  new Patient();
        patient.setName(newPatient.getName());
        patient.setGender(newPatient.getGender());
        patient.setAge(newPatient.getAge());
        patient.setAddress(newPatient.getAddress());
        patient.setDiagnosis(newPatient.getDiagnosis());
        patient.setDoctor(doctor);

        return patientRepository.save(patient);
    }
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Patient getPatientById(int id , String email) {
        return patientRepository.findByIdOrAddress(id,email).orElseThrow(() -> new RuntimeException("Patient not found"));
    }
//    public Patient updatePatient(int id,Patient updatedPatient) {
//        Patient currentPatient =getPatientById(id);
//        if(currentPatient != null) {
//            currentPatient.setName(updatedPatient.getName());
//            currentPatient.setGender(updatedPatient.getGender());
//            currentPatient.setAddress(updatedPatient.getAddress());
//            currentPatient.setDiagnosis(updatedPatient.getDiagnosis());
//            currentPatient.setAge(updatedPatient.getAge());
//        }
//        return patientRepository.save(currentPatient);
//
//    }
    public String deletePatient(int id) {
        patientRepository.deleteById(id);
        return "Patient with ID= " + id + "successfully  deleted";

    }
    public String  deleteAllPatients() {
        patientRepository.deleteAll();
       return "All patients successfully  deleted";

    }

}
