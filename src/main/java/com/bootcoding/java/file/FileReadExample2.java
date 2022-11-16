/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.file;

import java.io.File;
import java.util.Scanner;

public class FileReadExample2 {

    public static void main(String[] args) {
        File file = new File("C://data//bottle.txt");
        try {
            Scanner sc = new Scanner(file);
            String inputText = "bottles";
            int count = 0;
            while(sc.hasNext()) {
                String text = sc.nextLine();
//            String text = "99 bottles of beer on the wall , 99 bottles of beer.";
                String[] tokens = text.split(" ");
                for (int i = 0; i < tokens.length; i++) {
                    if (inputText.equals(tokens[i])) {
                        count++;
                    }
                }
            }

            System.out.println(inputText + " is repeated by " + count + " times");
        }catch (Exception ex){

        }
    }
}
