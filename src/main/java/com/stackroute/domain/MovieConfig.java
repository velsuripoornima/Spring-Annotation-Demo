package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
@PropertySource("classpath:actorinfo.properties")
public class MovieConfig {

    @Bean
    public Actor actorBean(){

        return new Actor();
    }

    @Bean
    public Movie movieBean(){

        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}
