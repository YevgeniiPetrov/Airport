package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
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
public class ResponsePassengerDTOImpl implements ResponsePassengerDTO {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
}
