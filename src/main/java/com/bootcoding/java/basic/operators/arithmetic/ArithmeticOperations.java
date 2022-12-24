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
        modulo();
        preIncrement();
        preDecrement();
        postIncrement();
        postDecrement();
    }
    private static void postDecrement() {
        int result;
        System.out.println("POST DECREMENT BY ONE");
        int postDecrement = 5;
        System.out.println("Initial value: " + postDecrement);
        result = postDecrement--;
        System.out.println("result   = " + result + ", postDecrement = " + postDecrement);
        System.out.println("postDecrement--   = " + postDecrement);
        result = 10 + postDecrement--;
        System.out.println(" result (10 + postDecrement--) = " + result);
        System.out.println("postDecrement--   = " + postDecrement);
        System.out.println();
    }

    private static void postIncrement() {
        System.out.println("POST INCREMENT BY ONE");
        int postIncrement = 5;

        double d = 234.744;
        double e = d++; //1.Assignment 2.Increment
        System.out.println("e = " + e + " , d = " + d);

        System.out.println("Initial value: " + postIncrement);
        int result = 10 + postIncrement++; // 1.Addition 2.Assignment 3.Increment
        System.out.println(" result (10 + postIncrement++) = " + result);
        System.out.println("postIncrement++   = " + (postIncrement++));
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
        int result = 10 + ++preIncrement; // 1.Increment, 2.Addition, 3.Assignment
        System.out.println(" result (10 + ++preIncrement) = " + result);
        System.out.println();
    }

    private static void modulo() {
        int result;
        System.out.println("MODULO (REMINDER)");
        int rem = 5;

        System.out.println("Initial value: " + rem);
        result = rem % 2; // remainder
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
