package org.example.patientmanagement.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorRequestDto {
    @NotNull(message = "provide First name")
    private String firstName;
    @NotNull(message = "provide Last name")
    private String lastName;
    @Email(message = "provide correct email")
    private String email;
    private String phone;
    private String sex;
    @Length(min=3 , max=20 , message = "provide the characters that vary between 3-20")
    private String service;

}
