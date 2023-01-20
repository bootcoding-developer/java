package com.bootcoding.java.assignments;

public class PlusOne {

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int a[] = {9,9};
        int b[] = po.test(a);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }
    }


    // WAM to return negative element array from given array
    // for ex: [10,-3,20,-40] -> [-3, -40]
    // WAM to return positive element array from given array
    // for ex: [10,-3,20,-40] -> [10, 20]


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
}
