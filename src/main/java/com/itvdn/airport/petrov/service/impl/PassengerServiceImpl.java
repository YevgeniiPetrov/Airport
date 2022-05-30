package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestPassengerDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.mapper.MapperFactory;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.RepositoryFactory;
import com.itvdn.airport.petrov.service.PassengerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PassengerServiceImpl implements PassengerService {
    private RepositoryFactory repositoryFactory;
    private MapperFactory mapperFactory;

    @Override
    public ResponsePassengerDTO get(int id) {
        Optional<Passenger> optionalPassenger = repositoryFactory.getPassengerRepository().get(id);
        return optionalPassenger.isPresent() ?
                mapperFactory.getPassengerMapper().passengerToMap(optionalPassenger.get()) : null;
    }

    @Override
    public ResponsePassengerDTO add(RequestPassengerDTO requestPassengerDTO) {
        PassengerMapper passengerMapper = mapperFactory.getPassengerMapper();
        Passenger passenger = passengerMapper.mapToPassenger(requestPassengerDTO);
        return passengerMapper.passengerToMap(repositoryFactory.getPassengerRepository().add(passenger));
    }
}
