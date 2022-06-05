package com.itvdn.airport.petrov.dto.mapper.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.dto.ResponsePassengerDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.ResponseTicketDTOImpl;
import com.itvdn.airport.petrov.dto.mapper.FlightMapper;
import com.itvdn.airport.petrov.dto.mapper.PassengerMapper;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Passenger;
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
    public Ticket mapToTicket(RequestTicketDTO requestTicketDTO) {
        Passenger passenger = passengerMapper.mapToPassenger(requestTicketDTO.getPassenger());
        Flight flight = flightMapper.mapToFlight(requestTicketDTO.getFlight());
        Integer number = generateNumberTicket(requestTicketDTO.getPlace(), passenger, flight);
        return Ticket.builder()
                .number(number)
                .place(requestTicketDTO.getPlace())
                .passenger(passenger)
                .flight(flight)
                .build();
    }

    private Integer generateNumberTicket(int place, Passenger passenger, Flight flight) {
        return place * 100 + passenger.getId() * 10 + flight.getId();
    }
}
