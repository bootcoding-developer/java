package com.bootcoding.java.keywords;

import com.bootcoding.java.oops.Marker;

public class FinalKeyword {
    public static void main(String[] args) {

        /*
        * final keyword is used to create constant variable.
        * final variable can not be modified once it is initialized
        *
        */

        final int a = 10;
        //a = 20; // not allowed
        //a = 30; // not allowed
        final double PI = 3.14;
        // PI = 2.14 // not allowed
        // final keyword to object (reference variable)
        final Marker blueMarker = new Marker();
       // blueMarker = new Marker(); // not allowed
        // It is allowed to change property of an Object
        blueMarker.color = "Blue"; // allowed
        blueMarker.color = "RED"; // allowed
    }
}
