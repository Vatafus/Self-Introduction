package com.self.selfintroduction.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="Watches", schema = "self")
public class Watches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="brand")
    private String brand;

    @Column(name="type")
    private String type;

    @Column(name="created_at")
    private LocalDateTime createdAt;


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
//    @Column(name="image")
//    private String imageURL;

}
