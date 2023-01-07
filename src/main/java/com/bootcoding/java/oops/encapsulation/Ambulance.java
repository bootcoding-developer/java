package com.bootcoding.java.oops.encapsulation;

public class Ambulance {
    private String hospitalName;
    private String type;
    protected double charges;
    private boolean isAvailable;

    // To assign value - use Setter
    // To get value - use Getter

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
