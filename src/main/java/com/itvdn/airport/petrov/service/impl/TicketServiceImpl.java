package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.mapper.MapperFactory;
import com.itvdn.airport.petrov.dto.mapper.TicketMapper;
import com.itvdn.airport.petrov.entity.Ticket;
import com.itvdn.airport.petrov.repository.RepositoryFactory;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TicketServiceImpl implements TicketService {
    private RepositoryFactory repositoryFactory;
    private MapperFactory mapperFactory;

    @Override
    public ResponseTicketDTO get(int id) {
        Optional<Ticket> optionalTicket = repositoryFactory.getTicketRepository().get(id);
        if (!optionalTicket.isPresent()) {
            return null;
        }
        return mapperFactory.getTicketMapper().ticketToMap(optionalTicket.get());
    }

    @Override
    public ResponseTicketDTO add(RequestTicketDTO requestTicketDTO) {
        TicketMapper ticketMapper = mapperFactory.getTicketMapper();
        Ticket ticket = ticketMapper.mapToTicket(requestTicketDTO);
        return ticketMapper.ticketToMap(repositoryFactory.getTicketRepository().add(ticket));
    }

}
