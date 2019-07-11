package com.stakeroute;

import com.stakeroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {


    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
    Movie movie=applicationContext.getBean("MovieA",Movie.class);
    Movie movie1=applicationContext.getBean("MovieB",Movie.class);
    movie.Act();

    System.out.println("printing the bean is same or not.");
    System.out.println(movie==movie1);

//    BeanFactory xmlBeanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//    Movie movie2=xmlBeanFactory.getBean("movie",Movie.class);
//    movie1.Act();
//
//    BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//    XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//    xmlBeanDefinitionReader.loadBeanDefinitions(new FileSystemResource("/home/bhawana/Desktop/SpringApplication/src/resources/beans.xml"));
//    Movie movie3= ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movie",Movie.class);
//    movie3.Act();


 }
}

