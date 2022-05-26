package com.itvdn.airport.petrov.configuration;

import com.itvdn.airport.petrov.dao.DAOFactory;
import com.itvdn.airport.petrov.dao.impl.DAOFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public DAOFactory DAOFactory() {
        return new DAOFactoryImpl();
    }
}
