package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class Actor {

    @Value("${actor.name}") //getting value from properties file
    private String name;

    @Value("${actor.gender}") //getting value from properties file
    private String gender;

    @Value("${actor.age}")//getting value from properties file
    private int age;

//    @Value("${actor.name}")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//     @Value("${actor.gender}")
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//     @Value("${actor.age}")
//    public void setAge(int age) {
//        this.age = age;
//    }

    public void actorInformation(){

        System.out.println("name of the actor:"+name+"\n age of the actor is:"+age+"\n gender of the actor is:"+gender);

    }
}
