package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestPassengerDTOImpl implements RequestPassengerDTO {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Integer passport;
}
