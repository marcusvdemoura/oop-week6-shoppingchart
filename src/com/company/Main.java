package com.company;

public class Main {

    public static void main(String[] args) {



        Producs producs1 = new Producs(10,10);
        ShoppingCart shoppingCart1 = new ShoppingCart(producs1);
        CheckOut checkout1 = new CheckOut(shoppingCart1);



    }
}
