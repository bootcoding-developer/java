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

        // initiailization while(condition) {.... inc/dec}
        for(int count = 0; count <= 10; count++){
            System.out.println(" Increment Loop "+ count);
        }

        for(int count = 10; count >= 0; count--){
            System.out.println(" Decrement Loop " + count);
        }
    }
}
