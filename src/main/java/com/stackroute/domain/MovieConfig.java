package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
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

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    
    public BeanLifecycleDemoBean beanLifecycleDemoBean(){

        return new BeanLifecycleDemoBean();
    }

//    @Bean
//    @Scope("prototype")
//    public Movie rammovie1(){
//
//        return new Movie(actorBean());
//    }
}
