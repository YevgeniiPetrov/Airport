package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.ControllerFactory;
import com.itvdn.airport.petrov.controller.PassengerController;
import com.itvdn.airport.petrov.controller.TicketController;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ControllerFactoryImpl implements ControllerFactory {
    private PassengerController passengerController;
    private TicketController ticketController;
}
