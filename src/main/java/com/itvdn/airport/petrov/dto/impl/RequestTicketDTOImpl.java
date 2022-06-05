package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestTicketDTOImpl implements RequestTicketDTO {
    @NotNull
    private Integer place;
    @NotNull
    private RequestEntityDTOImpl passenger;
    @NotNull(message = "flight can not null")
    private RequestEntityDTOImpl flight;
}
