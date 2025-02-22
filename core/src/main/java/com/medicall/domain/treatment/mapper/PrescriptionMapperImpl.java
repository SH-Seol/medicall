package com.medicall.domain.treatment.mapper;

import com.medicall.domain.major.domain.entity.Major;
import com.medicall.domain.medical.domain.entity.Doctor;
import com.medicall.domain.member.dto.response.PrescriptionResponse;
import com.medicall.domain.treatment.entity.Prescription;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-13T19:02:32+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.2.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class PrescriptionMapperImpl implements PrescriptionMapper {

    @Override
    public PrescriptionResponse toPrescriptionResponse(Prescription prescription) {
        if ( prescription == null ) {
            return null;
        }

        String specialty = null;
        Long id = null;
        LocalDateTime createdAt = null;

        specialty = prescriptionDoctorMajorTitle( prescription );
        id = prescription.getId();
        createdAt = prescription.getCreatedAt();

        PrescriptionResponse prescriptionResponse = new PrescriptionResponse( id, specialty, createdAt );

        return prescriptionResponse;
    }

    @Override
    public List<PrescriptionResponse> toPrescriptionResponseList(List<Prescription> prescriptions) {
        if ( prescriptions == null ) {
            return null;
        }

        List<PrescriptionResponse> list = new ArrayList<PrescriptionResponse>( prescriptions.size() );
        for ( Prescription prescription : prescriptions ) {
            list.add( toPrescriptionResponse( prescription ) );
        }

        return list;
    }

    private String prescriptionDoctorMajorTitle(Prescription prescription) {
        if ( prescription == null ) {
            return null;
        }
        Doctor doctor = prescription.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        Major major = doctor.getMajor();
        if ( major == null ) {
            return null;
        }
        String title = major.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }
}
