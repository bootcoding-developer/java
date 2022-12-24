package com.bootcoding.java.methods;

public class Method1 {

    public static void main(String[] args) {
        // pre-defined method
        // user-defined method
        int currentSpeed = 0;
        increaseSpeed(currentSpeed++);
        increaseSpeed(currentSpeed++);
        increaseSpeed(currentSpeed++);

        System.out.println("jklasjdlg");
        print("jklasjdlg");
        decreaseSpeed(currentSpeed--);
        decreaseSpeed(currentSpeed--);


    }
    public static void print(String message){
        System.out.println(message);
    }

    public static void increaseSpeed(int currentSpeed){
        ++currentSpeed;
        System.out.println("Fan is ON at speed : " + currentSpeed);
    }
    // Method Definition
    public static void decreaseSpeed(int currentSpeed){
        --currentSpeed;
        System.out.println(currentSpeed);
    }



    /*

    Method
    1) Method definition
    2) Method calling

    1. Syntax of Method
    - No Argument Method - No Parameterized Method
    <return_type> method_name(){

    }

    - Parameterized Method
    <return_type> method-name (List of parameters){

    }

    // return type (data type)
    1) void
    2) int
    3) float
    4) double

    + return value (variable)
    * */






    public static void add(int a, int b){
        System.out.println(a + b);
    }
}
