package com.chezouam.tabletennis.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Rubber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "play_style")
    private PlayStyle playStyle;

    @Lob
    private byte[] picture;

    @Enumerated(EnumType.STRING)
    private Color color;
    private float thickness;

}
