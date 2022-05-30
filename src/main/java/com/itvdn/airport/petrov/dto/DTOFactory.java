package com.itvdn.airport.petrov.dto;

public interface DTOFactory {
    RequestPassengerDTO getRequestPassengerDTO();
    ResponsePassengerDTO getResponsePassengerDTO();
    RequestTicketDTO getRequestTicketDTO();
    ResponseTicketDTO getResponseTicketDTO();
    ResponseRouteDTO getResponseRouteDTO();
    ResponseStateDTO getResponseStateDTO();
    ResponseFlightDTO getResponseFlightDTO();
}
