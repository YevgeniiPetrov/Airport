package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.PassengerRepository;
import com.itvdn.airport.petrov.service.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PassengerServiceImpl implements PassengerService {
    private PassengerRepository passengerRepository;
    private PassengerMapper passengerMapper;

    @Override
    public ResponsePassengerDTO get(int id) {
        Optional<Passenger> optionalPassenger = passengerRepository.get(id);
        return optionalPassenger.map(passenger -> passengerMapper.passengerToMap(passenger)).orElse(null);
    }

    @Override
    public ResponsePassengerDTO add(RequestPassengerDTO requestPassengerDTO) {
        Passenger passenger = passengerMapper.mapToPassenger(requestPassengerDTO);
        return passengerMapper.passengerToMap(passengerRepository.add(passenger));
    }
}
