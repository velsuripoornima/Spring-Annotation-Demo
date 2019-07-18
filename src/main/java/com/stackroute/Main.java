package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        //display using the application context
        ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie=context.getBean( "ramMovie",Movie.class);
        movie.displayInfo();

        Movie movie1=context.getBean( "ramMovie1",Movie.class);
        movie1.displayInfo();

        System.out.println(movie == movie1); //resulting false


    }
}
