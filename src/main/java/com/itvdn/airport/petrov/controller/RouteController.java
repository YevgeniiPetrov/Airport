package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface RouteController {
    ResponseCompleted delete(@RequestBody @Valid RequestEntityDTO requestEntityDTO);
}
