package com.example.Training.AOP.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

//    @Pointcut("execution(public void get*())")
//    public void getAllMEthods(){}
//
//    @Pointcut("execution(public  void return*())")
//    public void returnAllMethods(){
//    }
    @Pointcut("execution(public void  add*(..))")
    public void addMethods(){
    }

}
