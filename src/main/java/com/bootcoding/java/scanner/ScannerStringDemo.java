package com.bootcoding.java.scanner;

import java.util.Scanner;

public class ScannerStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        String line = sc.nextLine();
        char output = findDuplicateChar(word);
    }

    private static char findDuplicateChar(String word) {
        char[] chars = word.toCharArray();
        for(int i = 0 ; i < chars.length; i++){
            for(int j = i+1; j < chars.length; j++){
                if(chars[i] == chars[j]){
                    return chars[i];
                }
            }
        }
        return '0'; //todo task
    }
}
