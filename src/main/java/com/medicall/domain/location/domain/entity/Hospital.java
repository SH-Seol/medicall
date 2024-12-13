package com.medicall.domain.location.domain.entity;

import com.medicall.common.domain.BaseEntity;
import com.medicall.domain.major.domain.entity.Major;
import com.medicall.domain.major.domain.entity.Speciality;
import com.medicall.domain.medical.domain.entity.Doctor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Hospital extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    병원 이름
     */
    @Column(length = 200)
    private String title;

    /*
    병원에 속한 의사 목록
     */
    @OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Doctor> doctors = new ArrayList<>();

    /*
    병원 진료과목
     */
    @OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Speciality> specialities = new ArrayList<>();

    @Column
    private String description;
}
