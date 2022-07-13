package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import com.itvdn.airport.petrov.entity.Route;

public interface RouteMapper {
    ResponseRouteDTO routeToMap(Route route);
    Route mapToRoute(RequestEntityDTO requestEntityDTO);
}
