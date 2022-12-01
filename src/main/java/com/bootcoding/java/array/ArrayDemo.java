package com.bootcoding.java.array;

public class ArrayDemo {

    // [number of elements]
    public static void main(String[] args) {

        int[] numbers = {10, 100, 20, 22, 33,56,34};
        // declare, type of array, size of array, number of elements
        // index begins from 0 to n-1 (where n is size of an array)
        double[] prices = new double[5];
        // declare,  type of array, size of array
        // value of each element
        prices[0] = 34.322;
        prices[1] = 44.34;
        prices[3] = 55.454;

        // loop - begin value or end value - lower bound and upper bound
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            System.out.println(numbers[i]); // i = 0,1,2,3,4,5,6
        }

        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }
    }
}
