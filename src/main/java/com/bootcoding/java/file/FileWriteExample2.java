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

public class FileWriteExample2 {

    public static void main(String[] args) {
        File file = new File("C://data//bottle.txt");

       try{
           if(file.createNewFile()){
                int n = 99;
                FileWriter fw = new FileWriter(file);
                while(n != 0){
                    fw.write("99 bottles of beer on the wall, " +
                            "99 bottles of beer.\n" +
                            "Take one down and pass it around, " +
                            "98 bottles of beer on the wall.");
                    n--;
                }
                fw.close();
           }
       }catch (IOException ex){
           ex.printStackTrace();
       }
    }
}
