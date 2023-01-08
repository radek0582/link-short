package com.example.demo;

import java.time.LocalDate;

class CreateLinkDto {


    private final String id;
    private final String targetUrl;
    private final LocalDate expirationDate;
    private final String email;

    CreateLinkDto(final String id, final String targetUrl, final LocalDate expirationDate, final String email) {
        this.id = id;
        this.targetUrl = targetUrl;
        this.expirationDate = expirationDate;
        this.email = email;
    }

    LinkDto toDto() {
        return new LinkDto(id, email, targetUrl, expirationDate, 0);
    }
}
