package com.bootcoding.java.methods;

public class Calculator {

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static double division(int a, int b){
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {

        int res = add(10, 20);
        System.out.println(res);
        double div = division(20, 5);
        System.out.println(div);
    }
}
