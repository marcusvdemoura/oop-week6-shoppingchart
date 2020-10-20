package com.company;

public class CheckOut {


    private double finalPrice;
    private ShoppingCart shoppingCart;


    public CheckOut(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void totalPrice (){
        double finalPrice = shoppingCart.getTotalPriceApple() + shoppingCart.getTotalPriceOrange();
        this.finalPrice = finalPrice;
        System.out.println("The total is: "+ finalPrice+"€.");
    }

}
