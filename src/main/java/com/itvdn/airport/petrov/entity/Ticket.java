package com.itvdn.airport.petrov.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket extends Essence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private Integer number;
    private Integer place;
    @ManyToOne(targetEntity = Passenger.class)
    private Passenger passenger;
    private Boolean removed;
    @ManyToOne(targetEntity = Flight.class)
    private Flight flight;
}
