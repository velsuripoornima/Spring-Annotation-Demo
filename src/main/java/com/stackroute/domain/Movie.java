package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //indicate to resolver this is a class ,for this create a object
public class Movie {

    @Autowired  //handling nullpointer Exception
    private Actor actor;

    public Movie(){

    }

    //constructor for actor class
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
