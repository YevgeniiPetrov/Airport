package com.itvdn.airport.petrov.controller;

public interface ControllerFactory {
    PassengerController getPassengerController();
    TicketController getTicketController();
}
