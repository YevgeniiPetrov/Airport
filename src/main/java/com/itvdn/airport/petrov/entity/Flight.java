package com.itvdn.airport.petrov.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalTime departure;
    private LocalTime arrival;
    private Boolean removed;
    @ManyToOne(targetEntity = Route.class)
    private Route route;
    @ManyToOne(targetEntity = State.class)
    private State state;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "flight")
    private List<Ticket> tickets;
}
