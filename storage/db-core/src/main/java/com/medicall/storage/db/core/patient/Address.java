package com.medicall.storage.db.core.patient;

public record Address(
        String zipcode,
        String roadAddress,
        String detailAddress,
        String extraInfo
) {
}
