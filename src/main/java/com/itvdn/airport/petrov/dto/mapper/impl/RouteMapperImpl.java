package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseRouteDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.RouteMapper;
import com.itvdn.airport.petrov.entity.Route;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class RouteMapperImpl implements RouteMapper {
    @Override
    public ResponseRouteDTO routeToMap(Route route) {
        return ResponseRouteDTOImpl.builder()
                .id(route.getId())
                .from(route.getFrom())
                .to(route.getTo())
                .build();
    }

    @Override
    public Route mapToRoute(RequestEntityDTO requestEntityDTO) {
        return Route.builder()
                .id(requestEntityDTO.getId().intValue())
                .build();
    }
}
