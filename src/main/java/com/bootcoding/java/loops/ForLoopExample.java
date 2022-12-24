/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.loops;

public class ForLoopExample {

    public static void main(String[] args) {


        // initialization
        // condition
        // increment/decrement

        int age = 100;
        int temp = 100;
        // check -E - divide by 2 or odd - subtract by 1 until age becomes 0
        int steps = 0;
        for(int i = 0; age > 0; i++){
            if(age % 2 == 0){
                // Even number
                age = age / 2;
            }else{
                // odd number
                age = age - 1;
            }
            steps++;
        }
        System.out.println("Number of steps required to make " + temp + " into 0 is " + steps);

        // 1
        // 100 / 2 = 50/2 = 25, 25-1, 24/2, 12/2, 6/2, 3-1, 2/2, 1/2

    }
}
