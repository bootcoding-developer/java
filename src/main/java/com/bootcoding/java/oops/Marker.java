package com.bootcoding.java.oops;

public class Marker {
    // Data Member - instance variable
    public String type;
    public String brand;
    public String color;
    public double price;

    // Member Methods
    // Access Specifier
    // private, public, protected, <default>
    public void refill() {
        System.out.println("Refill marker successfully");
    }

    public void write(String message){
        System.out.println("On White Board - " + message);
    }

    public void print(){
        System.out.println("Marker Brand : " + brand);
        System.out.println("Marker Type : " + type);
        System.out.println("Marker Color : " + color);
        System.out.println("Marker Price : " + price);
    }

}
