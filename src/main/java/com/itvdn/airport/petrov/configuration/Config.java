package com.itvdn.airport.petrov.configuration;

import com.itvdn.airport.petrov.dto.ResponseCompleted;
import com.itvdn.airport.petrov.dto.impl.ResponseCompletedImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ResponseCompleted getResponseCompleted() {
        return new ResponseCompletedImpl("Operation completed successfully");
    }
}
