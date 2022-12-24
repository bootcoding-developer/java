/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.basic.operators.conditional;

public class ConditionDemo {


    public static void main(String[] args) {


        // Arithmetic Operators +-*/% ++ --

        // Conditional Operators
        // > , <, <=, >=, == , !=

        int a = 10;
        int b= 20;
        boolean val = a > b; // true / false (boolean)


        // keywords - if and else

//        if(condition){ // true // false
//            // block execute // nahi hoga
//        }

        if(a > b){
            System.out.println("A is greater");
        } else{
            System.out.println("B is greater");
        }




        boolean isMorning = false;

        if(isMorning) {
            System.out.println("Good Morning!");
        }else {
            System.out.println("Good Evening");
        }


         
        int currentTime = 9;
        if(currentTime <= 12){
            System.out.println("Good Morning!");
        }
        if(currentTime > 12){
            System.out.println("Good Evening");
        }else{
            System.out.println("Good Morning!");
        }
        // a + b * c - d
        // a > b < c ! d
        // Logical Operators -> && || !
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // true -> !true = false | false -> !false = true
        if(currentTime > currentTime || currentTime <= currentTime){

        }




        a = 15;
        // check a number is divisible by 3 - print divisible by 3
        // else print - not divisible by 3
        if(a % 3 == 0){
            System.out.println(a + " is divisible by 3");
        }else{
            System.out.println(a + " is not divisible by 3");
        }
        if(a % 5 == 0){
            System.out.println(a + " is divisible by 5");
        }else{
            System.out.println(a + " is not divisible by 5");
        }

        // logical operators -> && || !
        if(a % 3 == 0 && a % 5 == 0){
            System.out.println(a + " is divisible by 3 and 5!");
        }else{
            System.out.println(a + " is not divisible by 3 and 5!");
        }

        //TODOD - check divisibility for 5
    }
}
