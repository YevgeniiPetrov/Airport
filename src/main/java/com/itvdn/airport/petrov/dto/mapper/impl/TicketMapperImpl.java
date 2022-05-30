package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseTicketDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.MapperFactory;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TicketMapperImpl implements TicketMapper {
    private MapperFactory mapperFactory;

    @Autowired
    public TicketMapperImpl(@Lazy MapperFactory mapperFactory) {
        this.mapperFactory = mapperFactory;
    }

    @Override
    public ResponseTicketDTO ticketToMap(Ticket ticket) {
        PassengerMapper passengerMapper = mapperFactory.getPassengerMapper();
        ResponsePassengerDTO passenger = passengerMapper.passengerToMap(ticket.getPassenger());
        FlightMapper flightMapper = mapperFactory.getFlightMapper();
        ResponseFlightDTO flight = flightMapper.flightToMap(ticket.getFlight());
        return ResponseTicketDTOImpl.builder()
                .id(ticket.getId())
                .number(ticket.getNumber())
                .place(ticket.getPlace())
                .passenger(passenger)
                .flight(flight)
                .build();
    }

    @Override
    public Ticket mapToTicket(RequestTicketDTO requestTicketDTO) {
        return Ticket.builder()
                .number(requestTicketDTO.getNumber())
                .place(requestTicketDTO.getPlace())
                .passenger(requestTicketDTO.getPassenger())
                .flight(requestTicketDTO.getFlight())
                .build();
    }
}
