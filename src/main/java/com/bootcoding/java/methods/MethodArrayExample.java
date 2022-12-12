package com.bootcoding.java.methods;

public class MethodArrayExample {

    public static void main(String[] args) {
        int[] array = {2,5,8,11,15};
        int res = getSumOfAllElementsOfArray(array);
        System.out.println(res);
        int[] array2 = getRandomArray(10);
        for(int i = 0; i<array2.length; i++){
            System.out.println(array2[i]);
        }
    }

    public static int[] getRandomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i< size; i++){
            array[i] = i * 10;
        }
        return array;
    }

    public static int getSumOfAllElementsOfArray(int[] numArray){
        int sum = 0;
        for(int i = 0; i < numArray.length; i++){
            sum = sum + numArray[i];
        }
        return sum;
    }
}
