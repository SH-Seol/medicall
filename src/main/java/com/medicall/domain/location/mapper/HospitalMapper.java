package com.medicall.domain.location.mapper;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.location.dto.response.HospitalResponse;
import com.medicall.domain.major.domain.entity.Speciality;
import com.medicall.domain.medical.domain.entity.Doctor;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface HospitalMapper {
    @Mapping(target = "specialities", source = "specialities", qualifiedByName = "toSpecialityTitles")
    @Mapping(target = "doctors", source = "doctors", qualifiedByName = "toDoctorCount")
    HospitalResponse toResponse(Hospital hospital);

    List<HospitalResponse> toResponseList(List<Hospital> hospitals);

    @Named("toSpecialityTitles")
    default List<String> toSpecialityTitles(List<Speciality> specialities) {
        if (specialities == null) return Collections.emptyList();
        return specialities.stream()
                .map(s -> s.getMajor().getTitle())
                .toList();
    }

    @Named("toDoctorCount")
    default Long toDoctorCount(List<Doctor> doctors) {
        if (doctors == null) return 0L;
        return (long) doctors.size();
    }
}
