package com.itvdn.airport.petrov.controller;

import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.RequestFlightChangeDeparture;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

public interface FlightController {
    List<ResponseFlightDTO> getFlightsBetweenDates(@RequestParam @NotNull LocalDateTime dateFrom,
                                                   @RequestParam @NotNull LocalDateTime dateTo);
    ResponseCompleted delete(@RequestBody @Valid RequestEntityDTO requestEntityDTO);
    ResponseCompleted update(@RequestBody @Valid RequestFlightChangeDeparture requestFlightChangeDeparture);
}
