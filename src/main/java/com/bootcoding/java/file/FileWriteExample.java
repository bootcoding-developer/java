/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {



        try {
            File file = new File("/Users/bootcoding/index2.js");
            if(file.createNewFile()){
                System.out.println("File has been created!");
            }else {
                System.out.println("File exists already!");
            }
            System.out.println("Is File readable : " + file.canRead());
            System.out.println("Is File Write : " + file.canWrite());
            System.out.println("Is File Execute : " + file.canExecute());
            System.out.println("File Path " + file.getPath());
            System.out.println(" Absolute File Path " + file.getAbsolutePath());

            FileWriter fw = new FileWriter(file);
            fw.write("Welcome to File Writing example, data has been written by programmatically!");
            fw.close();

            System.out.println("File Contents: ");

            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
