package com.itvdn.airport.petrov.entity;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private Double rating;
    private Boolean removed;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
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
    @OneToMany(mappedBy = "airline")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Plane> planes;
}
