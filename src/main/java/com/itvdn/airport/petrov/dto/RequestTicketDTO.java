package com.itvdn.airport.petrov.dto;

import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Passenger;

public interface RequestTicketDTO {
    Integer getNumber();
    Integer getPlace();
    Passenger getPassenger();
    Flight getFlight();
}
