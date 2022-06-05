package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.RequestTicketDTO;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public interface TicketController {
    ResponseTicketDTO get(@RequestParam int id);
    ResponseCompleted create(@RequestBody @Valid RequestTicketDTO requestTicketDTO);
    List<ResponseTicketDTO> getTicketsBetweenDates(@RequestParam @NotNull LocalDateTime dateFrom,
                                                   @RequestParam @NotNull LocalDateTime dateTo);
}
