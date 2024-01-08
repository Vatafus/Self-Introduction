package com.self.selfintroduction.domain;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Countries", schema = "self")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;



}
