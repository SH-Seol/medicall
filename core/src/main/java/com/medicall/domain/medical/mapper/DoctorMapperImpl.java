package com.medicall.domain.medical.mapper;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.major.domain.entity.Major;
import com.medicall.domain.medical.domain.entity.Doctor;
import com.medicall.domain.member.dto.response.DoctorProfileResponse;
import com.medicall.domain.member.dto.response.DoctorResponse;
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
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public DoctorResponse toDoctorResponse(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        String major = null;
        String hospital = null;
        Long id = null;
        String name = null;

        major = doctorMajorTitle( doctor );
        hospital = doctorHospitalTitle( doctor );
        id = doctor.getId();
        name = doctor.getName();

        DoctorResponse doctorResponse = new DoctorResponse( id, name, major, hospital );

        return doctorResponse;
    }

    @Override
    public DoctorProfileResponse toDoctorProfileResponse(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        String major = null;
        String hospital = null;
        Long id = null;
        String name = null;
        String description = null;
        Integer years = null;

        major = doctorMajorTitle( doctor );
        hospital = doctorHospitalTitle( doctor );
        id = doctor.getId();
        name = doctor.getName();
        description = doctor.getDescription();
        years = doctor.getYears();

        DoctorProfileResponse doctorProfileResponse = new DoctorProfileResponse( id, name, major, hospital, description, years );

        return doctorProfileResponse;
    }

    @Override
    public List<DoctorResponse> toDoctorResponseList(List<Doctor> doctors) {
        if ( doctors == null ) {
            return null;
        }

        List<DoctorResponse> list = new ArrayList<DoctorResponse>( doctors.size() );
        for ( Doctor doctor : doctors ) {
            list.add( toDoctorResponse( doctor ) );
        }

        return list;
    }

    private String doctorMajorTitle(Doctor doctor) {
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

    private String doctorHospitalTitle(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }
        Hospital hospital = doctor.getHospital();
        if ( hospital == null ) {
            return null;
        }
        String title = hospital.getTitle();
        if ( title == null ) {
            return null;
        }
        return title;
    }
}
