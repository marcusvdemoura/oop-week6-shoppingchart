package com.company;

import java.util.ArrayList;

public class CheckOut {

    private Oranges oranges;
    private Apples apples;
    private double finalPrice;
    public static ArrayList<Integer> list_of_products = new ArrayList<>();


    public CheckOut(Oranges oranges, Apples apples) {
        this.oranges = oranges;
        this.apples = apples;
        list_of_products.add(apples.getNumber_of_apples(), oranges.getNumber_of_oranges());


    }

    public static ArrayList<Integer> getList_of_products() {
        return list_of_products;
    }


    static void listOfProducts (){

        System.out.println("PRODUCTS PURCHASED:");
        for (int i = 0; i<list_of_products.size(); i++){
            System.out.println(list_of_products.get(i));
        }

    }

    public void final_Price (){
        double finalPrice = ((oranges.getNumber_of_oranges()* oranges.price_per_unit_oranges)
                + apples.getNumber_of_apples()* apples.price_per_unit_apples);
        this.finalPrice = finalPrice;
        System.out.println("The final price for the shopping is: " + finalPrice);
    }


}
}
