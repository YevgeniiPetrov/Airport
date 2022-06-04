package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestTicketCreationDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Ticket;
import com.itvdn.airport.petrov.repository.TicketRepository;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private TicketRepository ticketRepository;
    private TicketMapper ticketMapper;

    @Override
    public ResponseTicketDTO get(int id) {
        Optional<Ticket> optionalTicket = ticketRepository.get(id);
        return optionalTicket.map(ticket -> ticketMapper.ticketToMap(ticket)).orElse(null);
    }

    @Override
    public ResponseTicketDTO add(RequestTicketCreationDTO requestTicketCreationDTO) {
        Ticket ticket = ticketMapper.mapToTicket(requestTicketCreationDTO);
        return ticketMapper.ticketToMap(ticketRepository.add(ticket));
    }

}
