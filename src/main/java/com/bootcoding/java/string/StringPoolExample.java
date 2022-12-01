package com.bootcoding.java.string;

public class StringPoolExample {


    public static void main(String[] args) {

        // How to create String Object
        String name1 = new String("Barbeque Nation").intern();
        String name2 = new String("Barbeque Nation");

        String name3 = "Barbeque Nation";
        String name4 = "Barbeque Nation";
        // name - reference variable of String object
        boolean areTheySame = name1.equals(name2);
        System.out.println(name1 + " and " + name2 + " same : " + areTheySame);
        boolean areTheirAddressSame = name1 == name2;
        System.out.println(name1 + " and " + name2 + " address same : " + areTheirAddressSame);
        System.out.println(name1 + " and " + name3 + " name3  same : " + (name1.equals(name3)));
        System.out.println(name1 + " and " + name3 + " name3 address same : " + (name1 == name3));
        System.out.println(name1 + " and " + name3 + " name4  same : " + (name4.equals(name3)));
        System.out.println(name1 + " and " + name3 + " name4 address same : " + (name4 == name3));
        // name1 - address of actual object // 2000
        // name2 - address of actual object // 3000
    }
}
