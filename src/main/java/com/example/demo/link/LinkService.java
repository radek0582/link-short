package com.example.demo.link;

import com.example.demo.LinkDto;


public interface LinkService {
    LinkDto createLink(LinkDto toDto);

    LinkDto getLinkAndIncrementVisits (String id) throws LinkNotFoundException;
}
