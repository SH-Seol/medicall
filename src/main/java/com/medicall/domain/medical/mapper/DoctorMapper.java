package com.medicall.domain.medical.mapper;

import com.medicall.domain.medical.domain.entity.Doctor;
import com.medicall.domain.member.dto.response.DoctorProfileResponse;
import com.medicall.domain.member.dto.response.DoctorResponse;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    @Mapping(target = "major", source = "major.title")
    @Mapping(target = "hospital", source = "hospital.title")
    DoctorResponse toDoctorResponse(Doctor doctor);

    @Mapping(target = "major", source = "major.title")
    @Mapping(target = "hospital", source = "hospital.title")
    DoctorProfileResponse toDoctorProfileResponse(Doctor doctor);

    List<DoctorResponse> toDoctorResponseList(List<Doctor> doctors);
}
