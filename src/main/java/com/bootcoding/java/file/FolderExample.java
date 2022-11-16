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

public class FolderExample {
    public static void main(String[] args) {

        File jdkFolder = new File("/Library/Java/JavaVirtualMachines/jdk-11.0.16.jdk/Contents/Home");

        if(jdkFolder.isDirectory()){
            // listFiles is only applicable to Directory not a file
            File[] files = jdkFolder.listFiles();
            for(File file : files){
                System.out.println(file.getPath());
                System.out.println(file.getName());

                if(file.getName().equals("README.html")){
                    // read file
                }
            }
        }
    }
}
