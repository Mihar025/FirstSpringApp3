package com.example.Training.AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@ComponentScan
@Aspect
@Order(3)
public class SecurityAspect {
//
//@Before("com.example.Training.AOP.Aspect.MyPointCuts.getAllMEthods()|| com.example.Training.AOP.Aspect.MyPointCuts.returnAllMethods()")
//    public void beforegetSecurityAdvice(){
//        System.out.println("beforegetSecurityAdvice: checking license for getting Food/Water");
//        System.out.println("---------------------------------");

     //Logging Aspect for Joint Cut

        @Before("com.example.Training.AOP.Aspect.MyPointCuts.addMethods()")
        public void beforeAddSecurityAdvice(){
            System.out.println("beforeAddSecurityAdvice: checking license for getting Food/Water");
            System.out.println("---------------------------------");


        }
}
