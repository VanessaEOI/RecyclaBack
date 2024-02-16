package com.recyclaback.recyclaback.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String itemName;
    private int globalScore;
    private boolean recyclability;
    private Integer recyclabilityRate;
    private Integer recyclabilityCost;
    private Integer energyCost;
}