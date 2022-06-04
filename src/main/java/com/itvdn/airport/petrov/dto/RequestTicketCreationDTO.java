package com.itvdn.airport.petrov.dto;

import com.itvdn.airport.petrov.entity.Flight;
import com.itvdn.airport.petrov.entity.Passenger;

public interface RequestTicketCreationDTO {
    Integer getNumber();
    Integer getPlace();
    Passenger getPassenger();
    Flight getFlight();
}
