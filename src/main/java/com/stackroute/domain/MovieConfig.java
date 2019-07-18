package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration  //indicating the this is configuration file or not
@ComponentScan(basePackages = "com.stackroute")  //scannig class for creating the object
@PropertySource("classpath:actorinfo.properties")  //getting values from properties file
public class MovieConfig {

    @Bean  //for creating the bean
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
