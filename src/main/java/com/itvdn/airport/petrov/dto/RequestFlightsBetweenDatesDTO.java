package com.itvdn.airport.petrov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestFlightsBetweenDatesDTO {
    @NotNull
    private LocalDateTime dateFrom;
    @NotNull
    private LocalDateTime dateTo;
}
