package com.bootcoding.java.assignments;

public class NegativeElement {
    //1. Input - integer array with positive / negative
    // Processing
    // Create method with Array as input parameter
    // create new array to keep all negative numbers
    // Condition - If array element is less than 0 then
    // CountNegativeElements
    // push element to new Array
    // return new array


    //2. Output - array of negative numbers


    public static void iAmStaticMethod(){
        System.out.println("I am inside iAmStaticMethod()");
    }

    public int[] getNegativeElements(int num[]){
        System.out.println("In getNegativeElements()");
        int count = getNegativeCount(num);
        int j = 0;
        int[] negatives = new int[count];
        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                negatives[j++] = num[i];
            }
        }

        return negatives;
    }

    private int getNegativeCount(int[] num) {
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] < 0){
                count++;
            }
        }
        return count;
    }

    static{
        System.out.println("I am inside static block");
    }
    public static void main(String[] args) {
        NegativeElement ne = new NegativeElement();
        int [] n = {10,-2,30,-44,0};
        int[] res = ne.getNegativeElements(n);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
