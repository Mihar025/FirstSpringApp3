package com.example.Training.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
    @Value("Pizza")
    private String foodName;

    @Value("LuiDelvincho")
    private String pizzaOwner;
    @Value("5")
    private int slicePrice;


    public String getFoodName(){
        return foodName;
    }

    public String getPizzaOwner(){
        return pizzaOwner;
    }
    public Integer getSlicePrice(){
        return slicePrice;
    }


    ////////////////////////////////////////////////////

    public void getFood(String foodName, Food food ){
        System.out.println("We got order some food " + foodName);
        System.out.println("---------------------------------");
    }

    public void returnFood(){
        System.out.println("We cancel order, food going back"); //After Job Create list with food and puted food inside method
        System.out.println("---------------------------------");
    }

    public void getDeliveryFast(){
        System.out.println("You choosed fast delivery");
        System.out.println("---------------------------------");
    }

        public void getDeliverySlow(){
            System.out.println("You choosed slow delivery");
            System.out.println("---------------------------------");
        }
        /////////////////////////////////////////////////////////////
        public void addFood(String foodName, Integer slicePrice ){
            System.out.println("We have special offeer for you! Only today! :?" + foodName + " for: " + slicePrice + "$");
            System.out.println("---------------------------------");

        }

        public void addReturnFood(String getPizzaOwner){
            System.out.println("Name of our Manager: " + getPizzaOwner );
            System.out.println("---------------------------------");

        }


    }