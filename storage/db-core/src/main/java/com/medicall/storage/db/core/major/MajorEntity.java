package com.medicall.storage.db.core.major;

import com.medicall.storage.db.core.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
public class MajorEntity extends BaseEntity {
    /*
    전공명
    ex. 외과, 내과, 등등
     */
    @Column(nullable = false)
    private String title;
}
