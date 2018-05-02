package com.chezouam.tabletennis.service;

import com.chezouam.tabletennis.entity.Rubber;
import com.chezouam.tabletennis.repository.RubberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class RubberService {

    private RubberRepository rubberRepository;

    @Autowired
    public RubberService(RubberRepository rubberRepository) {
        this.rubberRepository = rubberRepository;
    }

    public Optional<Rubber> getRubberByName(String rubberName){
        return rubberRepository.findByName(rubberName);

    }

    public Optional<Rubber> getRubberById(Long id) {
        return rubberRepository.findById(id);

    }
}
