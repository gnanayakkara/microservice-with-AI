package com.fitness.activityservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WeblientConfig {

    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }

    @Bean
    public WebClient userServiceWebclient(WebClient.Builder webclientBuilder){
        return webclientBuilder
                .baseUrl("http://USER-SERVICE")
                .build();
    }
}
