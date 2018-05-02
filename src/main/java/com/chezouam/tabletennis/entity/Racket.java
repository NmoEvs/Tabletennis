package com.chezouam.tabletennis.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Racket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Rubber.class)
    private Rubber Backend;
    @ManyToOne(targetEntity = Rubber.class)
    private Rubber Forehand;
    @ManyToOne(targetEntity = Rubber.class)
    private Blade blade;
    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Player> players;
}
