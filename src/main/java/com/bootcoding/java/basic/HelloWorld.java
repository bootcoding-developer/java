/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.basic;
/*
* Example of Hello World in Java
* @author bootcoding-developer
* */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello");
        System.out.println("World!");
        int limit = 100;
        for (int i = 0; i<limit; i++){
            for (int j=0; j<=i && i < limit/2; j++) {
                System.out.print(" ");
            }
            for(int k=limit; k>i && i >= limit/2; k--){
                System.out.print(" ");
            }
            System.out.println("Hello World!");
        }

        System.out.println("_   _        _  _          _    _               _      _");
        System.out.println("| | | |      | || |        | |  | |             | |    | |");
        System.out.println("| |_| |  ___ | || |  ___   | |  | |  ___   _ __ | |  __| |");
        System.out.println("|  _  | / _ \| || | / _ \  | |/\| | / _ \ | '__|| | / _` |");
        System.out.println("       | | | ||  __/| || || (_) | \  /\  /| (_) || |   | || (_| |");
        System.out.println("\_| |_/ \___||_||_| \___/   \/  \/  \___/ |_|   |_| \__,_|");

    }
}
