package com.bootcoding.java.assignments;

import com.bootcoding.java.oops.Marker;

public class ObjectAssignment {
    public static void main(String[] args) {
        // primitive data types
        int a = 10;
        float b = a; // b <- a (value of a)
        b = 30; // b - change but not changing a
        System.out.println("a ki value = " + a);
        System.out.println("b ki value = " + b);

        // ADT - Abstract Data Type (Object)
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker; // redMarker <- BlueMarker (reference)
        blueMarker.color = "Blue";
        redMarker.color = "Red";
        System.out.println("BlueMarker ki value = " + blueMarker.color);
        System.out.println("RedMarker ki value = " + redMarker.color);

    }
}
