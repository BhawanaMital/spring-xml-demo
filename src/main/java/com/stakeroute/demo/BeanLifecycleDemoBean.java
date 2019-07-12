package com.stakeroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean,DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method is called");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Property set method is called");

    }

    public void customInit(){
        System.out.println("Custom init method");
    }

    public void customDestroy(){
        System.out.println("Custom destroy method is called");
    }
}
