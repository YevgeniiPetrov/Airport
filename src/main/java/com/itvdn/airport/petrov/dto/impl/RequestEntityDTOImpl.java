package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RequestEntityDTOImpl implements RequestEntityDTO {
    @NotNull
    private int id;
}
