package com.medicall.domain.term;

public enum TermType {
    REQUIRED("필수"),
    OPTIONAL("선택");

    private final String displayName;

    TermType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
