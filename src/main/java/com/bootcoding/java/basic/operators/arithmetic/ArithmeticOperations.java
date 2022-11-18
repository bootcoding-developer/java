/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.basic.operators.arithmetic;

public class ArithmeticOperations {


    public static void main(String[] args) {
//        print();
        add();

        subtract();

        multiplication();

        division();

        modulo();

        preIncrement();

        preDecrement();

        postIncrement();

        postDecrement();

    }



    private static void print() {


        System.out.println("Hello!\nHow are you doing?\n");
        System.out.println("She said \"Hello!\" to me.");

        /*
        *   -> What is an escape sequence
        *       two characters of source code that represent a single character.
        *       (The backslash allows you to escape the string to write special characters.)
        *
        *   newline         \n
        *   tab             \t
        *   double quote    \"
        *   backslash       \\
        *
        * */
    }












    public static void add(){
        int result;
        System.out.println("ADDITION OF NUMBERS");

        int x = 20; // declare + initilization

        System.out.println("Initial value: " + x); // + is used to concatenate strings

        result = x + 2; // 1.Addtion, 2.Assignment // = 22
        System.out.println("x + 2 = " + result);

        result = x; // re-initialize // = 20
        System.out.println("x = " + result);

        System.out.println(); // a blank line print

        double y = 23.7545;
        float z = (float) 48296.47;
        float z2 =  23.334f;

        double dd = x + y;
        System.out.println("x + y = " + (x + y));
        float res = x + z;
        System.out.println("x + z = " + (x + z));
    }

    public static void subtract(){
        int result;
        System.out.println("SUBTRACTION");
        int x = 15;

        System.out.println("Initial value: " + x);
        System.out.println("x - 4 = " + (x - 4));
        System.out.println("x = " + x);
        System.out.println();
    }

    private static void postDecrement() {
        int result;
        System.out.println("POST DECREMENT BY ONE");
        int postDecrement = 5;

        System.out.println("Initial value: " + postDecrement);
        result = postDecrement--;
        System.out.println("result   = " + result);
        System.out.println("postDecrement--   = " + postDecrement);
        result = 10 + postDecrement--;
        System.out.println(" result (10 + postDecrement--) = " + result);
        System.out.println("postDecrement--   = " + postDecrement);
        System.out.println();
    }

    private static void postIncrement() {
        System.out.println("POST INCREMENT BY ONE");
        int postIncrement = 5;

        System.out.println("Initial value: " + postIncrement);
        System.out.println("postIncrement++   = " + (postIncrement++));
        int result = 10 + postIncrement++; // 1.add 2.assignment 3.increment
        System.out.println(" result (10 + postIncrement++) = " + result);
        System.out.println("postIncrement++   = " + postIncrement);
        System.out.println();
    }

    private static void preDecrement() {
        int result;
        System.out.println("PREDECREMENT BY ONE");
        int preDecrement = 5;

        System.out.println("Initial value: " + preDecrement);
        result = --preDecrement;
        System.out.println("--preDecrement   = " + result);
        result = 10 + --preDecrement;
        System.out.println(" result (10 + --preDecrement) = " + result);
        System.out.println(preDecrement);
        System.out.println();
    }

    private static void preIncrement() {
        System.out.println("PREINCREMENT BY ONE");
        int preIncrement = 5;

        System.out.println("Initial value: " + preIncrement);
        System.out.println("++preIncrement   = " + (++preIncrement));
        int result = 10 + ++preIncrement;
        System.out.println(" result (10 + ++preIncrement) = " + result);
        System.out.println();
    }

    private static void modulo() {
        int result;
        System.out.println("MODULO (REMINDER)");
        int rem = 5;

        System.out.println("Initial value: " + rem);
        result = rem % 2;
        System.out.println("rem % 2 = " + result);
        result = rem;
        System.out.println("rem = " + result);
        System.out.println();
    }

    private static void division() {
        System.out.println("DIVISION (INT)");
        int divOnInt = 15;

        double divOnDouble = 15.00;
        System.out.println("Initial value: " + divOnInt);
        System.out.println("divOnInt / 2 = " + (divOnInt / 2));
        System.out.println("divOnDouble / 2 = " + (divOnDouble / 2));
        System.out.println("divOnInt = " + divOnInt);
        System.out.println();
    }

    private static void multiplication() {
        int result;
        System.out.println("MULTIPLICATION");
        int x = 25;

        System.out.println("Initial value: " + x);
        result = x * 3;
        System.out.println("x * 3 = " + result);
        result = x;
        System.out.println("x = " + x);
        System.out.println();
    }
}
