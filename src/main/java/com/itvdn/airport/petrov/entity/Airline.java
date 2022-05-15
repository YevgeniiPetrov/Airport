package com.itvdn.airport.petrov.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airline extends Essence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private Double rating;
    private Boolean removed;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "flight_airline",
            joinColumns = {
                    @JoinColumn(name = "airline_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "flight_id")
            }
    )
    private List<Flight> flights;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "airline")
    private List<Plane> planes;
}
