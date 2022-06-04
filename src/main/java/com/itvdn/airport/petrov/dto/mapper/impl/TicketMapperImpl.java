package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov._dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov._dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.dto.RequestTicketCreationDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseTicketDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Ticket;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TicketMapperImpl implements TicketMapper {
    private PassengerMapper passengerMapper;
    private FlightMapper flightMapper;

    @Override
    public ResponseTicketDTO ticketToMap(Ticket ticket) {
        ResponsePassengerDTO passenger = passengerMapper.passengerToMap(ticket.getPassenger());
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
    public Ticket mapToTicket(RequestTicketCreationDTO requestTicketCreationDTO) {
        return Ticket.builder()
                .number(requestTicketCreationDTO.getNumber())
                .place(requestTicketCreationDTO.getPlace())
                .passenger(requestTicketCreationDTO.getPassenger())
                .flight(requestTicketCreationDTO.getFlight())
                .build();
    }
}
