package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Passenger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestTicketDTOImpl implements RequestTicketDTO {
    private Integer number;
    private Integer place;
    private Passenger passenger;
    private Flight flight;
}
