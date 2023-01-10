package com.bootcoding.java.assignments;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = inputArraySize(scanner);
        int[] numbers = takeArrayFromUser(scanner, size);
        printPrimeNumberOfArray(numbers);
    }
    private static int inputArraySize(Scanner scanner) {
        System.out.println("Enter Array Length: ");
        int size = scanner.nextInt();
        return size;
    }
    // [1,2,3] -> [1,2,4]
    // [1,2,9] -> [1,3,0]
    // [9,9,9] -> [1,0,0,0]
    public int[] test(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    private static int[] takeArrayFromUser(Scanner scanner, int size) {
        System.out.println("Enter Elements: ");
        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    private static void printPrimeNumberOfArray(int[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            boolean res = isPrimeNumber(numbers[i]);
            System.out.println("is " + numbers[i] + " a prime number ? = " + res);
        }
    }
    public static boolean isPrimeNumber(int num){
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
