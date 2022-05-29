package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.DTOFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DTOFactoryImpl implements DTOFactory {
    private RequestPassengerDTOImpl requestPassengerDTO;
    private ResponsePassengerDTOImpl responsePassengerDTO;

    @Override
    public RequestPassengerDTOImpl getRequestPassengerDTO() {
        return requestPassengerDTO;
    }

    @Override
    public ResponsePassengerDTOImpl getResponsePassengerDTO() {
        return responsePassengerDTO;
    }
}
