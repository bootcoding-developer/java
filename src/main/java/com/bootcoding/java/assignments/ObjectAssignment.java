package com.bootcoding.java.assignments;

import com.bootcoding.java.oops.Marker;

public class ObjectAssignment {
    public static void main(String[] args) {
        Marker blueMarker = new Marker();
        blueMarker.color= "BLUE";
        blueMarker.print();
        Marker redMarker = new Marker();
        redMarker.color= "RED";
        redMarker.print();
        Marker greenMarker = new Marker();
        greenMarker.color= "GREEN";
        greenMarker.print();
        Marker blackMarker = new Marker();
        blackMarker.color= "BLACK";
        blackMarker.print();

        NegativeElement.iAmStaticMethod();
    }
}
