package com.example.demo;

import java.time.LocalDate;

record LinkDto(String id, String email, String targetUrl, LocalDate expirationDate, int visits) {

}
