package com.itvdn.airport.petrov;

import com.itvdn.airport.petrov.configuration.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
    }
}
