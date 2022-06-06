package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.RouteMapper;
import com.itvdn.airport.petrov.entity.Route;
import com.itvdn.airport.petrov.repository.FlightRepository;
import com.itvdn.airport.petrov.repository.RouteRepository;
import com.itvdn.airport.petrov.service.FlightService;
import com.itvdn.airport.petrov.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RouteServiceImpl implements RouteService {
    private RouteRepository routeRepository;
    private FlightRepository flightRepository;
    private RouteMapper routeMapper;
    private FlightMapper flightMapper;
    private FlightService flightService;
    private ResponseCompleted responseCompleted;

    @Override
    public ResponseCompleted delete(RequestEntityDTO requestEntityDTO) {
        Route route = routeMapper.mapToRoute(requestEntityDTO);
        flightRepository.getAllByRoute(route).stream()
                .map(flightMapper::flightToRequestEntityDTO)
                .forEach(flightService::delete);
        routeRepository.delete(route);
        return responseCompleted;
    }
}
