package com.bootcoding.java.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverService {
    public static void main(String[] args) {
        new DriverService().createDrivers();
    }
    public ArrayList<Driver> createDrivers(){

        ArrayList<Driver> drivers = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + driver.getAge());
            driver.setType("CAB");
            driver.setGender("MALE");
            drivers.add(driver);
        }
        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + driver.getAge());
            driver.setType("CAB");
            driver.setGender("FEMALE");
            drivers.add(driver);
        }
        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + driver.getAge());
            driver.setType("AUTO");
            driver.setGender("MALE");
            drivers.add(driver);
        }
        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + driver.getAge());
            driver.setType("AUTO");
            driver.setGender("FEMALE");
            drivers.add(driver);
        }

        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + i);
            driver.setType("TRUCK");
            driver.setGender("MALE");
            drivers.add(driver);
        }

        for(int i = 1; i <= 5; i++){
            Driver driver = new Driver();
            driver.setAge(20 + i);
            driver.setName("Name " + driver.getAge());
            driver.setType("TRUCK");
            driver.setGender("FEMALE");
            drivers.add(driver);
        }

//        for(Driver driver : drivers){
//            System.out.println(driver);
//        }
        System.out.println("Using Lambda Function ");
       // drivers.stream().forEach(System.out::println);

        // Method Reference Operator

        List<Driver> femaleDrivers = drivers.stream()
                .filter(d -> d.getGender().equals("FEMALE"))
                .collect(Collectors.toList());

        femaleDrivers.stream().forEach(System.out::println);

        List<Driver> maleAutoDrivers = drivers.stream()
                .filter(d -> d.getGender().equals("MALE"))
                .filter(md -> md.getType().equals("AUTO"))
                .collect(Collectors.toList());
        System.out.println("Printing Male Auto Drivers");
        maleAutoDrivers.stream().forEach(System.out::println);
        return drivers;
    }
}
