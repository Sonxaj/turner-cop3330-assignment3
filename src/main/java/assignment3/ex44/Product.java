/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jonas Turner
 *
 */

package assignment3.ex44;

public class Product{

    // held in products
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int compareName(String name){
        if(name.equalsIgnoreCase(this.getName())){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Quantity: " + getQuantity() + "\n";
    }

}
