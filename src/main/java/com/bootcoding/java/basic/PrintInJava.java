/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.basic;

public class PrintInJava {
    public static void main(String[] args) {

        PrintInJava object = new PrintInJava();
        object.print(10);
        object.print(10.55);
        object.print('A');
        object.print("Bootcoding");
        object.print(true);
        object.printWithLiteral(10);
        object.printWithLiteral(10.55);
        object.printWithLiteral('A');
        object.printWithLiteral("Bootcoding");
        object.printWithLiteral(true);
    }

    private void print(int identifier){
        System.out.println(identifier);
    }
    private void print(double identifier){
        System.out.println(identifier);
    }
    private void print(char identifier){
        System.out.println(identifier);
    }
    private void print(String identifier){
        System.out.println(identifier);
    }
    private void print(boolean identifier){
        System.out.println(identifier);
    }
    private void printWithLiteral(int identifier){
        System.out.println("Value of Input variable is " + identifier);
    }
    private void printWithLiteral(double identifier){
        System.out.println("Value of Input variable is " + identifier);
    }
    private void printWithLiteral(char identifier){
        System.out.println("Value of Input variable is " + identifier);
    }
    private void printWithLiteral(String identifier){
        System.out.println("Value of Input variable is " + identifier);
    }
    private void printWithLiteral(boolean identifier){
        System.out.println("Value of Input variable is " + identifier);
    }
}
