package org.example.patientmanagement.Repositories;

import org.example.patientmanagement.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    Optional<Patient> findByIdOrAddress(int id, String email);
}
