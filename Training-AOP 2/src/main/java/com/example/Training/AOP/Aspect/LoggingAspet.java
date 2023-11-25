package com.example.Training.AOP.Aspect;

import com.example.Training.AOP.Food;
import com.example.Training.AOP.Water;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspet {
  //  @Before("com.example.Training.AOP.Aspect.MyPointCuts.getAllMEthods()|| com.example.Training.AOP.Aspect.MyPointCuts.returnAllMethods()")
    //public void beforeGetLoggingAdvice(){
      //  System.out.println("beforeGetLoggingAdvice: logging triend to order Food/Water" );
        //System.out.println("---------------------------------");

    //Logging Aspect for Joint Cut
    @Before("com.example.Training.AOP.Aspect.MyPointCuts.addMethods()")
        public void beforeaddLoggingAdvice(JoinPoint joinPoint){
  MethodSignature Methodsignature = (MethodSignature) joinPoint.getSignature();
            System.out.println("methodSignature = " + Methodsignature);
            System.out.println("methodSgnature.getMethod() = " + Methodsignature.getMethod());
            System.out.println("methodSgnature.getReturnType() = " + Methodsignature.getReturnType());
            System.out.println("methodSgnature.getName() = " + Methodsignature.getName());

    if(Methodsignature.getName().equals("addFood")){ //here I wrote about food
        Object[] arguments = joinPoint.getArgs();
        for(Object obj : arguments){
            if(obj instanceof Food){
                Food myFood = (Food) obj;
                System.out.println("Information about food: " + myFood.getFoodName() + "\n" +
                        "price: " + myFood.getSlicePrice() + "\n" + "Owner is :" + myFood.getPizzaOwner()
                );
            }
            else if(obj instanceof String){
                System.out.println("Food added: " + obj);
            }
        }
    }
    else if (Methodsignature.getName().equals("addTypeOfWater")){
        Object[] arguments = joinPoint.getArgs();
        for(Object obj : arguments){
            if(obj instanceof Water){
                Water Mywater = (Water) obj;
                System.out.println("Information about water: " + Mywater.getNameOfWater()+ " " +
                 Mywater.getWaterType()+  "\n" + "price: " + Mywater.getPriceOnWater() );
            }
            else if(obj instanceof  String){
                System.out.println("Water added " + obj);
            }
        }
    }


            System.out.println("beforeAddLoggingAdvice: logging tried to order Food/Water" );
            System.out.println("-------------------------------------------------------------");

        }
}
