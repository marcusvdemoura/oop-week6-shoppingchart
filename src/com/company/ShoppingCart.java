package com.company;

import java.util.ArrayList;

public class ShoppingCart {



    private Producs product;
    public static ArrayList<Integer> cart = new ArrayList<>();
    public final double pricePerOrange = 0.25;
    public final double pricePerApple = 0.50;
    private double totalPriceOrange;
    private double totalPriceApple;


    public ShoppingCart(Producs product) {
        this.product = product;
        cart.add(product.getApples(), product.getOranges());

    }

    public static ArrayList<Integer> getCart(int i) {
        return cart;
    }

    public double getPricePerOrange() {
        return pricePerOrange;
    }

    public double getPricePerApple() {
        return pricePerApple;
    }

    public double getTotalPriceOrange(){
        double totalPriceOrange = product.getOranges() * pricePerOrange;
        this.totalPriceOrange = totalPriceOrange;
        return totalPriceOrange;
    }

    public double getTotalPriceApple(){
        double totalPriceOrange = product.getApples() * pricePerApple;
        this.totalPriceApple = totalPriceApple;
        return totalPriceApple;
    }

}
