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
public class Route extends Essence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    @Column(name = "from_point")
    private String from;
    @Column(name = "to_point")
    private String to;
    private Boolean removed;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "route")
    private List<Flight> flights;
}
