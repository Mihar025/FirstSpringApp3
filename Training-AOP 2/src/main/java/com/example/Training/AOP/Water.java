package com.example.Training.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Water {
    @Value("Carbonated")
    private String water;
    @Value("3")
    private Integer priceOnWater;
    @Value("Poland Spring")
    private String nameofWater;


    public String getWaterType(){
        return water;
    }
    public Integer getPriceOnWater(){
        return priceOnWater;
    }

    public String getNameOfWater(){
        return  nameofWater;
    }


    public void addTypeOfWater(String water, Integer priceOnWater ){
        System.out.println("We got: " + water + " price: " + priceOnWater );
        System.out.println("-----------------------------------------------");
    }
    public void addWatername(String nameofWater){
        System.out.println("Name of this water is: " + nameofWater);
        System.out.println("-----------------------------------------------");

    }





//
//    public void getWater(){
//        System.out.println("We got order om water ");
//        System.out.println("---------------------------------");
//    }
//
//    public void returnWater(){
//        System.out.println("We cancel order, water going back"); //After Job Create list with water and puted food inside method
//        System.out.println("---------------------------------");
//    }
//
//    public void getDeliveryFast(){
//        System.out.println("You choosed fast delivery");
//        System.out.println("---------------------------------");
//    }
//
//    public void getDeliverySlow(){
//        System.out.println("You choosed slow delivery");
//        System.out.println("---------------------------------");
//    }


}
