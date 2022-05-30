package com.itvdn.airport.petrov.service.impl;

import com.itvdn.airport.petrov.service.PassengerService;
import com.itvdn.airport.petrov.service.ServiceFactory;
import com.itvdn.airport.petrov.service.TicketService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Getter
public class ServiceFactoryImpl implements ServiceFactory {
    private PassengerService passengerService;
    private TicketService ticketService;
}
