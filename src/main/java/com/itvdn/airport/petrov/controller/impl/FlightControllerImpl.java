package com.itvdn.airport.petrov.controller.impl;

import com.itvdn.airport.petrov.controller.FlightController;
import com.itvdn.airport.petrov.dto.ResponseFlightDTO;
import com.itvdn.airport.petrov.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class FlightControllerImpl implements FlightController {
    private FlightService flightService;

    @Override
    @GetMapping("/flight/find")
    public List<ResponseFlightDTO> getFlightsBetweenDates(@RequestParam @NotNull LocalDateTime dateFrom,
                                                          @RequestParam @NotNull LocalDateTime dateTo) {
        return flightService.getFlightsBetweenDates(dateFrom, dateTo);
    }
}
