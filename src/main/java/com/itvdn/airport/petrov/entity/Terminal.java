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
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private Boolean removed;
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
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
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
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
