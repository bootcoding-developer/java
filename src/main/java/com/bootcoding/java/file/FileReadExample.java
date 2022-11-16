/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {

    public static void main(String[] args) {
        try {

            File file = new File("/Users/bootcoding/index.js");
            Scanner scanner = new Scanner(file);

            System.out.println("Is File readable : " + file.canRead());
            System.out.println("Is File Write : " + file.canWrite());
            System.out.println("Is File Execute : " + file.canExecute());
            System.out.println("File Path " + file.getPath());
            System.out.println(" Absolute File Path " + file.getAbsolutePath());

            System.out.println("Reading File Contents: ");
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

//            [User, Group, ALL]
//            [RWX, ---, ---] // this file is only manageable by User
//            [RWX, R-X, ---] // User and Group
//            [RWX, R-X, R--]

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
