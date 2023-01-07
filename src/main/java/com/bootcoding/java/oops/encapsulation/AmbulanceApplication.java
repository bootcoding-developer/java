package com.bootcoding.java.oops.encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance();
        ambulance.setHospitalName("Seven Star Hospital");
        ambulance.setType("Bus");
        ambulance.setCharges(1000.00);
        ambulance.setAvailable(true);

        System.out.println("Ambulance Info:");
        System.out.println("Hospital Name: " + ambulance.getHospitalName());
        // TODO repeat for other properties
    }
}
