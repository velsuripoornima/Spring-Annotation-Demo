package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration
@PropertySource(value = "classpath:actorinfo.properties")
public class MovieConfig {

    @Bean
    public Actor actorBean(){

       return new Actor("ram","male",21);
    }

    @Bean(name = {"ramMovie","ramMovie1"})
    @Scope("prototype")

    public Movie ram()
    {

        return new Movie(actorBean());
    }

//    @Bean
//    @Scope("prototype")
//    public Movie rammovie1(){
//
//        return new Movie(actorBean());
//    }
}
