package com.stackroute.domain;


import org.springframework.context.annotation.*;

//indicatin the file is conguration file or not
@Configuration
public class MovieConfig {

    @Bean //creating for bean
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
