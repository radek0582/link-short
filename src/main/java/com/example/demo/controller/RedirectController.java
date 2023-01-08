package com.example.demo.controller;

import com.example.demo.LinkDto;
import com.example.demo.link.LinkNotFoundException;
import com.example.demo.link.LinkService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/s/")
class RedirectController {
    LinkDto linkDto;

    private final LinkService linkService;

    RedirectController(final LinkService linkService) {
        this.linkService = linkService;
    }


    @GetMapping("{id}")
    public ResponseEntity redirectLink(
            @PathVariable("id") String id, HttpServletResponse httpServletResponse) throws IOException {

        final LinkDto linkDto;

        try {
            linkDto = linkService.getLinkAndIncrementVisits(id);
            httpServletResponse.sendRedirect(linkDto.targetUrl());
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (LinkNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
