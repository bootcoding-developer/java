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
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FolderExample {
    private static final List<String> chapters = Arrays.asList("Chapter01","Chapter02","Chapter03"
    ,"Chapter04","Chapter05");
    public static void main(String[] args) {

        File jdkFolder = new File("/Users/bootcoding/Downloads/Java-Coding-Problems-master");

        printContents(jdkFolder);
    }

    private static void printContents(File jdkFolder) {
        if(jdkFolder.isDirectory()){
            // listFiles is only applicable to Directory not a file
            File[] files = jdkFolder.listFiles();

            for(File file : files){
                if(file.isDirectory()){
//                    if(chapters.contains(file.getName())) {
                        printContents(file);
//                    }
                }else {
                    if (file.getName().contains(".md")) {
                        // read file
                        try {
                            Scanner scanner = new Scanner(file);
                            System.out.println("Folder: " + file.getParent());
                            while (scanner.hasNext()) {
                                String line = scanner.nextLine();
                                System.out.println(line);
                            }
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
