package com.chezouam.tabletennis.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Blade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  name;
    private String  description;

    @Enumerated(EnumType.STRING)
    private PlayStyle playStyle;
}
