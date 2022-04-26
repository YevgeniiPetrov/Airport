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
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private Boolean removed;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "terminal_employee",
            joinColumns = {
                    @JoinColumn(name = "terminal_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "employee_id")
            }
    )
    private List<Employee> employees;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "flight_terminal",
            joinColumns = {
                    @JoinColumn(name = "terminal_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "flight_id")
            }
    )
    private List<Flight> flights;
}
