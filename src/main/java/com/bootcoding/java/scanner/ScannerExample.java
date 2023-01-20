package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int value = sc.nextInt();
        boolean res = isEven(value);
        if(res){
            System.out.println(value + " is Even Number");
        }else{
            System.out.println(value + " is Odd Number");
        }
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }
}

