package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
 //indicate to resolver this is a class ,for this create a object
@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    //handling nullpointer Exception
    @Autowired
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

    //inbuit method for ApplicationContextAware
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("implementing ApplicationContextAware .....");
    }

    //inbuit method for beanfactory demo
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("Implementing beanfactoryAware .....");
    }

    //inbuit method for beannameaware
    public void setBeanName(String s) {

        System.out.println("Implementing beanNameAware.....");

    }
}
