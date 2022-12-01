package com.bootcoding.java.string;

public class StringMethodsExample {


    public static void main(String[] args) {

        String data = "In this HTML tutorial";
        // [I,n, ,t,h,i,s, ,H,T,M,L, ,t,u,t,o,r,i,a,l]
//        // index of an element
//        System.out.println(data.substring(8));
//        System.out.println(data.substring(8,12));
//        System.out.println(data.toLowerCase());
//        System.out.println(data.toUpperCase());

        String content = "In this HTML tutorial, " +
                "you will find more than 200 examples. " +
                "With our online \"Try it Yourself\" editor, " +
                "you can. edit and test each. example. yourself!\n" ;

        String s1 = "HTML";
        String s2 = "html";
        System.out.println(s1.equals(s2));

//        int index = content.indexOf("200");
//        System.out.println(index);
//        int dotIndex = content.indexOf(".");
//        System.out.println(dotIndex);
//        char charAt = content.charAt(46);
//        System.out.println(charAt);
//        System.out.println("Total letters in the paragraph is " + content.length());
//        System.out.println(content);

        String substring = content.substring(13);
//        System.out.println(substring);

        String[] split = content.split("\\.");
        System.out.println(split);

        System.out.println("Total dots in given string is " + (split.length - 1));

    }
}
