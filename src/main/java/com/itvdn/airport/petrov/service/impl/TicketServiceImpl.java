package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Ticket;
import com.itvdn.airport.petrov.repository.TicketRepository;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private TicketRepository ticketRepository;
    private TicketMapper ticketMapper;
    private ResponseCompleted responseCompleted;

    @Override
    public ResponseTicketDTO get(int id) {
        Optional<Ticket> optionalTicket = ticketRepository.get(id);
        return optionalTicket.map(ticket -> ticketMapper.ticketToMap(ticket)).orElse(null);
    }

    @Override
    public ResponseCompleted add(RequestTicketDTO requestTicketDTO) {
        setTicketNumber(requestTicketDTO);
        setTicketCreationDate(requestTicketDTO);
        ticketRepository.add(ticketMapper.mapToTicket(requestTicketDTO));
        return responseCompleted;
    }

    @Override
    public List<ResponseTicketDTO> getTicketsBetweenDates(LocalDateTime dateFrom, LocalDateTime dateTo) {
        List<Ticket> tickets = ticketRepository.getAllBetweenDates(dateFrom, dateTo);
        return ticketMapper.ticketsToMap(tickets);
    }

    private void setTicketNumber(RequestTicketDTO requestTicketDTO) {
        Integer number = requestTicketDTO.getPlace() * 100
                + requestTicketDTO.getPassenger().getId() * 10
                + requestTicketDTO.getFlight().getId();
        requestTicketDTO.setNumber(number);
    }

    private void setTicketCreationDate(RequestTicketDTO requestTicketDTO) {
        requestTicketDTO.setCreationDate(LocalDateTime.now());
    }
}
