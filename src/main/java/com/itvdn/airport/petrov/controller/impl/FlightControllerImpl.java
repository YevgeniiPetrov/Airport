package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.FlightController;
import com.itvdn.airport.petrov.dto.RequestEntityDTO;
import com.itvdn.airport.petrov.dto.RequestFlightChangeDeparture;
import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class FlightControllerImpl implements FlightController {
    private FlightService flightService;

    @Override
    @GetMapping("/flight/find/")
    public List<ResponseFlightDTO> getFlightsBetweenDates(
            @RequestParam @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateFrom,
            @RequestParam @NotNull @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTo) {
        return flightService.getFlightsBetweenDates(dateFrom, dateTo);
    }

    @Override
    @DeleteMapping("/flight/delete")
    public ResponseCompleted delete(@RequestBody @Valid RequestEntityDTO requestEntityDTO) {
        return flightService.delete(requestEntityDTO);
    }

    @Override
    @PostMapping("/flight/update")
    public ResponseCompleted update(@RequestBody @Valid RequestFlightChangeDeparture requestFlightChangeDeparture) {
        return flightService.update(requestFlightChangeDeparture);
    }
}
