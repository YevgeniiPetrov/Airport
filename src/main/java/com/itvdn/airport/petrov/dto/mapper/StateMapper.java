package com.itvdn.airport.petrov.dto.mapper;

import com.itvdn.airport.petrov.dto.ResponseStateDTO;
import com.itvdn.airport.petrov.entity.State;

public interface StateMapper {
    ResponseStateDTO stateToMap(State state);
}
