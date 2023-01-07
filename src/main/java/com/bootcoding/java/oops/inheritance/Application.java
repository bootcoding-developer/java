package com.bootcoding.java.oops.inheritance;

import com.bootcoding.java.oops.encapsulation.Ambulance;

public class Application {

    public static void main(String[] args) {
         MobileAmbulance ma = new MobileAmbulance();
         // ma.charges // not accessible here
         ma.assignCharges();
    }
}
