package com.company;

public class Oranges {

    private int number_of_oranges;
    public final double price_per_unit_oranges = 0.25;


    public Oranges(int number_of_oranges) {
        this.number_of_oranges = number_of_oranges;

    }


    public int getNumber_of_oranges() {
        return number_of_oranges;
    }
}
