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
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    @Column(name = "from_point")
    private String from;
    @Column(name = "to_point")
    private String to;
    private Boolean removed;
    @OneToMany(mappedBy = "route")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Flight> flights;
}
