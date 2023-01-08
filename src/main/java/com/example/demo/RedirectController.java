package com.example.demo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/s/")
class RedirectController {

    @GetMapping("{id}")
    public void redirectLink(
            @PathVariable ("id") String id, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect("https://google.pl");
    }
}
