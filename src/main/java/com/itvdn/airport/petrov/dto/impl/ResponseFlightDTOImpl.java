package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import com.itvdn.airport.petrov.dto.ResponseStateDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFlightDTOImpl implements ResponseFlightDTO {
    private int id;
    private LocalTime departure;
    private LocalTime arrival;
    private ResponseRouteDTO route;
    private ResponseStateDTO state;
}
