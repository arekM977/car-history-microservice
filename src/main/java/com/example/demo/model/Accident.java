package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Accident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long vehicle_id;
    private String description;
    private LocalDateTime date_of_accident;

}
