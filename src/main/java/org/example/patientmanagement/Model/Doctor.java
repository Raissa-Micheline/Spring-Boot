package org.example.patientmanagement.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "the name should not be null")
    private String fullName;
    @Length(min=3 , max=20 , message = "provide the characters that vary between 3-20")
    private String specialisation;
    @Email(message = "provide correct email")
    @NotNull(message = "email must be present ")
    private String email;
    private String gender;
    private String clinic;

    @OneToMany(mappedBy = "doctor" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<Patient> patients;


}
