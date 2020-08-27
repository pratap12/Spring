package com.mymaven.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Spring Core Annotation
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung m31 = (Samsung)factory.getBean(Samsung.class);
    	m31.config();
   	
//        System.out.println( "Hello World!" );
    }
}
