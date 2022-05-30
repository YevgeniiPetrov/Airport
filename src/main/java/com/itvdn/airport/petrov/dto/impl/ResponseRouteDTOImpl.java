package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.ResponseRouteDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseRouteDTOImpl implements ResponseRouteDTO {
    private int id;
    private String from;
    private String to;
}
