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
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "from_point")
    private String from;
    @Column(name = "to_point")
    private String to;
    private Boolean removed;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "route")
    private List<Flight> flights;
}
