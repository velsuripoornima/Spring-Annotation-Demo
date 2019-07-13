package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration
public class MovieConfig {

    @Bean
    public Actor actorBean(){

       return new Actor("ram","male",21);
    }

    @Bean

    public Movie ram()
    {

        return new Movie();
    }

//    @Bean
//    @Scope("prototype")
//    public Movie rammovie1(){
//
//        return new Movie(actorBean());
//    }
}
