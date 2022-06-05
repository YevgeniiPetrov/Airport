package com.itvdn.airport.petrov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestTicketDTO {
    @NotNull
    private Integer place;
    @NotNull
    @Valid
    private RequestEntityDTO passenger;
    @NotNull
    @Valid
    private RequestEntityDTO flight;
}
