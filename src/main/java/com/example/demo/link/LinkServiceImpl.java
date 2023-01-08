package com.example.demo.link;

import com.example.demo.LinkDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

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


    @Transactional
    @Override
    public LinkDto getLinkAndIncrementVisits(final String id) throws LinkNotFoundException {
        LinkEntity linkDto = linkRepository.findById(id)
                .orElseThrow(() -> new LinkNotFoundException("Invalid client Id:" + id));

        linkDto.setVisits(linkDto.getVisits() + 1);
        linkRepository.save(linkDto);

        return linkDto.toDto();
    }
}
