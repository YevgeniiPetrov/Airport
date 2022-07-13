package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.controller.TicketController;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

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
    public ResponseCompleted create(@RequestBody @Valid RequestTicketDTO requestTicketDTO) {
        return ticketService.add(requestTicketDTO);
    }

    @Override
    @GetMapping("/ticket/find/")
    public List<ResponseTicketDTO> getTicketsBetweenDates(
            @RequestParam @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateFrom,
            @RequestParam @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTo) {
        return ticketService.getTicketsBetweenDates(dateFrom, dateTo);
    }
}
