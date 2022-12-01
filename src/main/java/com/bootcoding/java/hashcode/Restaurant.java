package com.bootcoding.java.hashcode;

import java.util.Objects;

public class Restaurant {

    private String name;
    private String address;
    private String type;

    public Restaurant(String name, String address, String type) {
        this.name = name;
        this.address = address;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {

        System.out.println("Invoked Restaurant Equals() method");
        return  true;
    }

    @Override
    public int hashCode() {
        System.out.println("Invoked Restaurant Hashcode() method");
        return 1;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
