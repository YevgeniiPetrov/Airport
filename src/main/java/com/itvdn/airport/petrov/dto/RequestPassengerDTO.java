package com.itvdn.airport.petrov.dto;

import java.time.LocalDate;

public interface RequestPassengerDTO {
    String getFirstName();
    String getLastName();
    LocalDate getBirthDate();
    Integer getPassport();
}
