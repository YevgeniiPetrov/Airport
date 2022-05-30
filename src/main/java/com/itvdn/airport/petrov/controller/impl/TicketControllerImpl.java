package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.TicketController;
import com.itvdn.airport.petrov.dto.ResponseTicketDTO;
import com.itvdn.airport.petrov.dto.impl.RequestTicketDTOImpl;
import com.itvdn.airport.petrov.service.ServiceFactory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TicketControllerImpl implements TicketController {
    private ServiceFactory serviceFactory;

    @Override
    @GetMapping("/ticket/get/")
    public ResponseTicketDTO get(int id) {
        return serviceFactory.getTicketService().get(id);
    }

    @Override
    @PostMapping("/ticket/create")
    public ResponseTicketDTO add(RequestTicketDTOImpl requestTicketDTO) {
        return serviceFactory.getTicketService().add(requestTicketDTO);
    }
}
