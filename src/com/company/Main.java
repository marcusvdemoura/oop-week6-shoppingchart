package com.company;

public class Main {

    public static void main(String[] args) {


        Products firstShopping = new Products(50, 20);

        Check_Out firstCheckOut = new Check_Out(firstShopping);

        firstCheckOut.final_Price();
        firstCheckOut.listOfProducts();


    }
}
