package com.chezouam.tabletennis.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @ManyToOne(targetEntity = Address.class)
    private Address address;
    @ManyToOne(targetEntity = Racket.class)
    private Racket racket;
    @Enumerated(EnumType.STRING)
    private Classment classment;


}
