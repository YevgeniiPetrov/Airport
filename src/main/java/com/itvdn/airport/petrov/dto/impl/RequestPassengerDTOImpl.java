package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestPassengerDTOImpl implements RequestPassengerDTO {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    private Integer passport;
}
