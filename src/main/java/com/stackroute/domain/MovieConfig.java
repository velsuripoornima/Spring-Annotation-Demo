package com.stackroute.domain;


import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.*;

 //indicating the this is configuration file or not
@Configuration
public class MovieConfig {

    @Bean //for creating the bean
    public Actor actorBean(){

       return new Actor("ram","male",21);
    }

    @Bean  //for creating the bean

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
