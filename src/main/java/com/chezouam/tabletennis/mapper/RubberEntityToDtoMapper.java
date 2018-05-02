package com.chezouam.tabletennis.mapper;

import com.chezouam.tabletennis.domain.RubberDto;
import com.chezouam.tabletennis.entity.Rubber;

import java.util.Base64;

public class RubberEntityToDtoMapper {

    public  static RubberDto mapToDto(Rubber entity){
        RubberDto rubberDto = new RubberDto();

        if (entity.getId() ==null) return rubberDto;

        rubberDto.setColor(entity.getColor().toString());
        rubberDto.setDescription(entity.getDescription());
        rubberDto.setName(entity.getName());
        rubberDto.setId(entity.getId());
        rubberDto.setPlayStyle(entity.getPlayStyle().toString());
        rubberDto.setThickness(entity.getThickness());
        rubberDto.setPicture(Base64.getEncoder().encodeToString(entity.getPicture()));




        return rubberDto;
    }



}
