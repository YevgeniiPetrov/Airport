package com.itvdn.airport.petrov.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    private Integer passport;
    private Boolean removed;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "passenger")
    private List<Ticket> tickets;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "flight_passenger",
            joinColumns = {
                    @JoinColumn(name = "passenger_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "flight_id")
            }
    )
    private List<Flight> flights;
}
