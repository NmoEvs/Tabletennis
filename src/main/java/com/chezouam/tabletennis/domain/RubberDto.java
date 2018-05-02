package com.chezouam.tabletennis.domain;

import lombok.Data;

@Data
public class RubberDto {

    private Long id;
    private String name;
    private String description;


    private String  playStyle;


    private String  picture;


    private String  color;
    private float thickness;
}
