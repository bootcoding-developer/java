package com.bootcoding.java.methods;

public class NaturalNumber {
    // method definition 1 time only
    public static void printNaturalNumber(int number){
        for(int i = 1; i<=number ; i++){
            System.out.println(i);
        }
    }

    public static void printEvenNumber(int number){
        for(int i = 1; i<= number; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printNaturalNumber(5);// method calling with argument value
        printEvenNumber(10);// method calling with argument value
        printNaturalNumber(15);// method calling with argument value
    }
}
