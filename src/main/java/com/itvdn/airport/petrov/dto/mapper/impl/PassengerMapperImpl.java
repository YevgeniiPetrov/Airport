package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.impl.ResponsePassengerDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.entity.Passenger;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class PassengerMapperImpl implements PassengerMapper {
    @Override
    public ResponsePassengerDTO passengerToMap(Passenger passenger) {
        return ResponsePassengerDTOImpl.builder()
                .id(passenger.getId())
                .firstName(passenger.getFirstName())
                .lastName(passenger.getLastName())
                .birthDate(passenger.getBirthDate())
                .build();
    }

    @Override
    public Passenger mapToPassenger(RequestPassengerDTO requestPassengerDTO) {
        return Passenger.builder()
                .firstName(requestPassengerDTO.getFirstName())
                .lastName(requestPassengerDTO.getLastName())
                .birthDate(requestPassengerDTO.getBirthDate())
                .passport(requestPassengerDTO.getPassport())
                .build();
    }

    @Override
    public Passenger mapToPassenger(RequestEntityDTO requestEntityDTO) {
        return Passenger.builder()
                .id(requestEntityDTO.getId().intValue())
                .build();
    }
}
