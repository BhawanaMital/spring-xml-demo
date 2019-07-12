package com.stakeroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public  class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    public Movie() {

    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void Act()
    {
        actor.act();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);

    }

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "actor=" + actor +
//                '}';
    }

