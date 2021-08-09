package com.example.cnscatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;
import static org.springframework.web.servlet.function.ServerResponse.ok;

@SpringBootApplication
@EnableConfigurationProperties(PolarProperties.class)
public class CnsCatalogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CnsCatalogServiceApplication.class, args);
    }

    @Bean
    RouterFunction<ServerResponse> routes(PolarProperties properties) {
        return route(GET("/"), request -> ok().body(properties.getGreeting()));
    }
}
