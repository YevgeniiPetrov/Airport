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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private Double salary;
    private Boolean removed;
    @OneToMany(mappedBy = "post")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Employee> employees;
}
