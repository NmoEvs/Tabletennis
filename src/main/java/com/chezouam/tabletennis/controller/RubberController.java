package com.chezouam.tabletennis.controller;

import com.chezouam.tabletennis.entity.Rubber;
import com.chezouam.tabletennis.mapper.RubberEntityToDtoMapper;
import com.chezouam.tabletennis.service.RubberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import static java.util.Optional.empty;

@Controller
public class RubberController {

    private RubberService rubberService;

    @Autowired
    public RubberController(RubberService rubberService) {
        this.rubberService = rubberService;
    }

    @RequestMapping("/rubber")
    public String getRubberByName(Model rubber ){

        Optional<Rubber> roxxor = rubberService.getRubberByName("Roxxor");
        rubber.addAttribute("rubber", RubberEntityToDtoMapper.mapToDto(roxxor.orElseGet(Rubber::new)));
        return "rubber";
    }
}
