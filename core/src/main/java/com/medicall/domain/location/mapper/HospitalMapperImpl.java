package com.medicall.domain.location.mapper;

import com.medicall.domain.location.domain.entity.Hospital;
import com.medicall.domain.location.dto.response.HospitalResponse;
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
public class HospitalMapperImpl implements HospitalMapper {

    @Override
    public HospitalResponse toResponse(Hospital hospital) {
        if ( hospital == null ) {
            return null;
        }

        List<String> specialities = null;
        Long doctors = null;
        Long id = null;
        String title = null;

        specialities = toSpecialityTitles( hospital.getSpecialities() );
        doctors = toDoctorCount( hospital.getDoctors() );
        id = hospital.getId();
        title = hospital.getTitle();

        HospitalResponse hospitalResponse = new HospitalResponse( id, title, specialities, doctors );

        return hospitalResponse;
    }

    @Override
    public List<HospitalResponse> toResponseList(List<Hospital> hospitals) {
        if ( hospitals == null ) {
            return null;
        }

        List<HospitalResponse> list = new ArrayList<HospitalResponse>( hospitals.size() );
        for ( Hospital hospital : hospitals ) {
            list.add( toResponse( hospital ) );
        }

        return list;
    }
}
