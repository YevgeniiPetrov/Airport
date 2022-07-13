package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.RouteController;
import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.service.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class RouteControllerImpl implements RouteController {
    private RouteService routeService;

    @Override
    @DeleteMapping("/route/delete")
    public ResponseCompleted delete(@RequestBody @Valid RequestEntityDTO requestEntityDTO) {
        return routeService.delete(requestEntityDTO);
    }
}
