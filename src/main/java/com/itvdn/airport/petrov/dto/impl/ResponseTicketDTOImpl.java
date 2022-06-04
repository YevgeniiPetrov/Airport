package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov._dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
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
public class ResponseTicketDTOImpl implements ResponseTicketDTO {
    private int id;
    private Integer number;
    private Integer place;
    private ResponsePassengerDTO passenger;
    private ResponseFlightDTO flight;
}
