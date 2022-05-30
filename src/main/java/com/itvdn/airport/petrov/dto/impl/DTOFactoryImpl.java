package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
public class DTOFactoryImpl implements DTOFactory {
    private RequestPassengerDTO requestPassengerDTO;
    private ResponsePassengerDTO responsePassengerDTO;
    private RequestTicketDTO requestTicketDTO;
    private ResponseTicketDTO responseTicketDTO;
    private ResponseRouteDTO responseRouteDTO;
    private ResponseStateDTO responseStateDTO;
    private ResponseFlightDTO responseFlightDTO;
}
