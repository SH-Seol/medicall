package com.medicall.domain.treatment.mapper;

import com.medicall.domain.member.dto.response.PrescriptionResponse;
import com.medicall.domain.treatment.entity.Prescription;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PrescriptionMapper {
    @Mapping(target = "specialty", source = "doctor.major.title")
    PrescriptionResponse toPrescriptionResponse(Prescription prescription);

    List<PrescriptionResponse> toPrescriptionResponseList(List<Prescription> prescriptions);
}
