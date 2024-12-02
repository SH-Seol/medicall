package com.medicall.domain.location.domain.entity;

import com.medicall.common.domain.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //시도명
    private String region;

    //시군구명
    private String city;

    //읍면동
    private String town;

    //도로명 주소
    private String road;

    // ex. 102동 1201호
    private String addable;

    // 건물중심점_x좌표
    private Double buildingCenterPointXCoordinate;

    // 건물중심점_y좌표
    private Double buildingCenterPointYCoordinate;

}
