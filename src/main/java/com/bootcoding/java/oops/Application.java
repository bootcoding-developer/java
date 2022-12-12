package com.bootcoding.java.oops;

public class Application {
    public static void main(String[] args) {
        // How to create object - syntax for object creation
        // ClassName objectName = new ClassName();
        Marker marker = new Marker();
        //Access members of an object
        // objectName.memberName -- data members
        marker.brand = "Camlin";
        marker.type = "WhiteBoardMarker";
        marker.color = "BLUE";
        marker.price = 142.34;

        // objectName.memberMethod()
        marker.refill();
        marker.write("I am learning OOPs in Java");
        marker.print();

        //create object of car


    }
}
