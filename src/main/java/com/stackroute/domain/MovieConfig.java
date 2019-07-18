package com.stackroute.domain;


import org.springframework.context.annotation.*;


@Configuration  
//indicating the this is configuration file or not

@PropertySource(value = "classpath:actorinfo.properties") 
//getting values from properties file

public class MovieConfig {

    @Bean  //for creating the bean
    
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
