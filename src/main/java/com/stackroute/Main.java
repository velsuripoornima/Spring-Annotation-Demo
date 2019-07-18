package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.MovieConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        //display using the application context
        ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie=context.getBean("movieBean", Movie.class);
        movie.displayInfo();

        //display actor information using the XMLBean factory
            XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource(MovieConfig.class));
            Movie obj = factory.getBean("rammovie",Movie.class);
            obj.displayinfo();

            //display actor information using the beandefinition registry
            DefaultListableBeanFactory factory1=new DefaultListableBeanFactory();
            BeanDefinitionRegistry context1=new GenericApplicationContext(factory1);
            BeanDefinitionReader reader=new XmlBeanDefinitionReader(context1);
            reader.loadBeanDefinitions(MovieConfig.class);
            Movie shivam=factory1.getBean("rammovie",Movie.class);
            shivam.displayinfo();
        
    }
}
