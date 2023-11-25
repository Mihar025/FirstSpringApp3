package com.example.Training.AOP;
import java.util.Scanner;
import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Food food = context.getBean("food", Food.class);
        Water water = context.getBean("water", Water.class);
        MethodsForScanner mth = new MethodsForScanner();
        System.out.println("");
        mth.Hello();
        System.out.println("");
        int x = scanner.nextInt();

        if(x == 1){
            food.addFood("Pizza", 5);
            food.addReturnFood("Misha");
        }
        else if(x == 2){
             water.addTypeOfWater("Carbonated", 3);
             water.addWatername("Poland Spring");
        }
        else{
            System.out.println("Error 103");
        }


//
//        food.addFood("Pizza", 5);
//        food.addReturnFood("Misha");
//
//        water.addTypeOfWater("Carbonated", 3);
//        water.addWatername("Poland Spring");






    }
}
