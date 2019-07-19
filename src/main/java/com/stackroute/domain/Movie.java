package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    @Autowired //handling null pointer exception
    private Actor actor;

    public Movie(){

    }

    //constructor for actor class
    public Movie(Actor actor) {
        this.actor = actor;
    }


//   @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInfo(){

        actor.actorInformation();
    }
}
