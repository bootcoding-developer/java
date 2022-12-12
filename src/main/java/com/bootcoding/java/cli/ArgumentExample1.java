package com.bootcoding.java.cli;

public class ArgumentExample1 {

    public static void main(String[] numbers) {

        int len = numbers.length;
        System.out.println("Number of Arguments provided is " + len);

        int sum =  0;
        for(int i = 0; i < len; i++){
            System.out.println(numbers[i]);
            int number = Integer.parseInt(numbers[i]);
            sum =  sum + number;
            // int number2 = Integer.valueOf(args[i]);
        }
        System.out.println(sum);
    }

    public static void main(String numbers) {

        System.out.println("My main() method");
    }
}
