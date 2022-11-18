/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.loops;

public class WhileLoopExample {


    public static void main(String[] args) {




        boolean condition = false;

        /* While Loop */
        while (condition) {
            // code that is executed repeatedly as long as the condition is
            // true
        }

        int count  = 1;
        while(count <= 10){
            System.out.println("Inside while block : print count = " + count);
            count++;
        }


        System.out.println("Multiplcation Table (for loop)");
        int m  = 10;
        for(int i = 1; i <=10; i++){
            System.out.print( i * m + " ");
        }


        System.out.println("Multiplcation Table (while loop)");
        int ii = 1;
        while(ii <= 10){
            System.out.print( ii * m + " ");
            ii++;
        }








        // print only even numbers up to 50













        // difference between if and while
        // if statements just run once if the condition is true
        if (condition)
        {
            //statements;
        }
        // while statements are repeated while the condition is true
        while (condition)
        {
            //statements;
        }

        count = 5;

        if(count <= 10){
            System.out.println("Inside If block : print count = " + count);
//            count++;
        }

        while(count <= 10){
            System.out.println("Inside while block : print count = " + count);
            count++;
        }



        System.out.println("INFINITE LOOPs");

        int i = 0;

        while (i < 100) {

            int j = 10  + 3;
            int k = j + 3;
            if(i > 50){
                break;
            }
            int l = k + 3;
            i = i + 2;
        }

        // This loop runs forever since the variable i does not change
        // anymore after it is divisible by 3 the first time.









        /* do while loop */
        do {
            // The code here will always be executed once and then
            // repeatedly while the condition is true.
        } while (condition);



        int n = 100;

        do{
            if(n % 2 == 0) {
                System.out.println("In Do While Loop -> Numbers: " + n);
            }
            n++;
        }while(n <= 50);








    }
}
