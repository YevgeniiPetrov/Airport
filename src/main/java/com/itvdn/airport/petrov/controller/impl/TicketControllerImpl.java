package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.TicketController;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.RequestTicketDTOImpl;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TicketControllerImpl implements TicketController {
    private TicketService ticketService;

    @Override
    @GetMapping("/ticket/get/")
    public ResponseTicketDTO get(@RequestParam int id) {
        return ticketService.get(id);
    }

    @Override
    @PostMapping("/ticket/create")
    public ResponseTicketDTO add(@RequestBody RequestTicketDTOImpl requestTicketDTO) {
        return ticketService.add(requestTicketDTO);
    }
}
