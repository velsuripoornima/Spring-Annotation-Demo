package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    @Autowired
    private Actor actor;

    public Movie(){

    }

    public Movie(Actor actor) {
        this.actor = actor;
    }


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInfo(){

        actor.actorInformation();
    }
}
