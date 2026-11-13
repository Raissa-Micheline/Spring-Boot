package org.example.patientmanagement.Services;

import org.example.patientmanagement.DTO.DoctorRequestDto;
import org.example.patientmanagement.DTO.DoctorResponseDto;
import org.example.patientmanagement.Model.Doctor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper {


    @Mapping(target="fullName",
            expression= "java(doctorRequestDto.getFirstName() + \"\" + doctorRequestDto.getLastName())"
    )
    Doctor toEntity(DoctorRequestDto doctorRequestDto);

    DoctorResponseDto toDto(Doctor doctor);

}
