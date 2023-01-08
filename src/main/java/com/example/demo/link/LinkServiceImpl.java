package com.example.demo.link;

import com.example.demo.LinkDto;
import org.springframework.stereotype.Service;

@Service
class LinkServiceImpl implements LinkService {

    private final LinkRepository linkRepository;

    LinkServiceImpl(final LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }


    @Override
    public LinkDto createLink(final LinkDto toDto) {
        linkRepository.save(LinkEntity.fromDto(toDto));
        return toDto;
    }
}
