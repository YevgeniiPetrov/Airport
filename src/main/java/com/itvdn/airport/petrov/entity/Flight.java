package com.itvdn.airport.petrov.entity;

import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
    @Setter(AccessLevel.NONE)
    private int id;
    private LocalTime departure;
    private LocalTime arrival;
    private Boolean removed;
    @ManyToOne(targetEntity = Route.class)
    private Route route;
    @ManyToOne(targetEntity = State.class)
    private State state;
    @OneToMany(mappedBy = "flight")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Ticket> tickets;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
            name = "flight_airline",
            joinColumns = {
                    @JoinColumn(name = "flight_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "airline_id")
            }
    )
    private List<Airline> airlines;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
            name = "flight_passenger",
            joinColumns = {
                    @JoinColumn(name = "flight_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "passenger_id")
            }
    )
    private List<Passenger> passengers;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
            name = "flight_terminal",
            joinColumns = {
                    @JoinColumn(name = "flight_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "terminal_id")
            }
    )
    private List<Terminal> terminals;
}
