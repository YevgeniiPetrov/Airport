package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.*;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Passenger;
import com.itvdn.airport.petrov.repository.PassengerRepository;
import com.itvdn.airport.petrov.service.PassengerService;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PassengerServiceImpl implements PassengerService {
    private PassengerRepository passengerRepository;
    private PassengerMapper passengerMapper;
    private TicketMapper ticketMapper;
    private ResponseCompleted responseCompleted;
    private TicketService ticketService;

    @Override
    public ResponsePassengerDTO get(int id) {
        Optional<Passenger> optionalPassenger = passengerRepository.get(id);
        return optionalPassenger.map(passenger -> passengerMapper.passengerToMap(passenger)).orElse(null);
    }

    @Override
    public ResponseCompleted add(RequestPassengerDTO requestPassengerDTO) {
        passengerRepository.add(passengerMapper.mapToPassenger(requestPassengerDTO));
        return responseCompleted;
    }

    @Override
    public ResponseCompleted addTickets(RequestPassengerTicketsDTO requestPassengerTicketsDTO) {
        List<RequestTicketDTO> ticketDTOList = ticketMapper.mapToMap(requestPassengerTicketsDTO);
        ticketDTOList.stream().forEach(ticketService::add);
        return responseCompleted;
    }
}
