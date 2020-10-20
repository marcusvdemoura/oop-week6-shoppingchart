package com.company;


import java.util.HashMap;

public class Check_Out{
    private Products products;
   public static HashMap<Integer, Integer> list_of_products = new HashMap <Integer, Integer>();
   private double finalPrice;

    public Check_Out(Products products) {
        this.products = products;
        list_of_products.put(products.getOranges(), products.getApples());

    }

    public static HashMap<Integer, Integer> getList_of_products() {
        return list_of_products;
    }


    static void listOfProducts (){

        System.out.println("PRODUCTS PURCHASED:");
        for (Integer i: list_of_products.keySet()){
            System.out.println("Number of Oranges: " + i + ".\nNumber of apples: " + list_of_products.get(i)+".");
        }

    }

    public void final_Price (){
        double finalPrice = (products.getOranges()*0.25) +(products.getApples() * 0.60);
        this.finalPrice = finalPrice;
        System.out.println("The final price for the shopping is: " + finalPrice);
    }


}
