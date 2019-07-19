package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    //inbuit method fordisposalbean
    public void destroy() throws Exception {

        System.out.println("implements disposal bean.....");
    }

    
    
    //inbuit method for initializingbean
    public void afterPropertiesSet() throws Exception {

        System.out.println("implementing initializing bean ....");

    }

    //calling custom init method through bean
    public void customInit(){

        System.out.println("custon initilization......");
    }

    //calling custom destroy method through bean
    public void customDestroy(){

        System.out.println("custom destroy method.....");
    }
}
