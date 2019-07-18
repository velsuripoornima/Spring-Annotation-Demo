package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //indicate to resolver this is a class ,for this create a object 
public class Movie {

    private Actor actor;

    @Autowired  //handling nullpointer Exception
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInfo(){

        actor.actorInformation();
    }
}
