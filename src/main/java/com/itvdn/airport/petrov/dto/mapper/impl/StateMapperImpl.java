package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.ResponseStateDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseStateDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.StateMapper;
import com.itvdn.airport.petrov.entity.State;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StateMapperImpl implements StateMapper {
    @Override
    public ResponseStateDTO stateToMap(State state) {
        return ResponseStateDTOImpl.builder()
                .id(state.getId())
                .title(state.getTitle())
                .build();
    }
}
