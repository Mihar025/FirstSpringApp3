package com.example.Training.AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)

public class ExceptionHandling {
//    @Before("com.example.Training.AOP.Aspect.MyPointCuts.getAllMEthods()|| com.example.Training.AOP.Aspect.MyPointCuts.returnAllMethods()")
//    public void beforeGetExceptionHandlingAdvice(){
//        System.out.println("beforeGetExceptionHandlingAdvice: catching exception when tried to order Food/Water");
//        System.out.println("------------------------------------------------------------------------------------");

    //Logging Aspect for Joint Cut
    @Before("com.example.Training.AOP.Aspect.MyPointCuts.addMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: catching exception when tried to order Food/Water");
        System.out.println("------------------------------------------------------------------------------------");
    }


}
