package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private LocalDateTime created;

    //relationship
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "vehicle_id", updatable = false, insertable = false)
    private List<Repair> repair;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "vehicle_id", updatable = false, insertable = false)
    private List<Inspection> inspection;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "vehicle_id", updatable = false, insertable = false)
    private List<Accident> accident;
}

