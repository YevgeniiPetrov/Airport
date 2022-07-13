package com.itvdn.airport.petrov.dto.impl;

import com.itvdn.airport.petrov.dto.ResponseCompleted;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCompletedImpl implements ResponseCompleted {
    private String message;
}
