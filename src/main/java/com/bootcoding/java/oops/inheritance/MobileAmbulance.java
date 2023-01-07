package com.bootcoding.java.oops.inheritance;

import com.bootcoding.java.oops.encapsulation.Ambulance;

public class MobileAmbulance extends Ambulance {
    // parent protected property becomes -> private to child class

    public void assignCharges(){
        charges = 100;
    }
}
