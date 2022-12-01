package com.bootcoding.java.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class LambdaExample1 {


    public static void main(String[] args) {
        new LambdaExample1().test();
    }

    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // WAP to count the number of words present in a given line
        // separated by space.


        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) % 2 == 0) {
                print(list.get(i));
            }
        }
        for(int i = 0 ; i < list.size(); i++){
            square(list.get(i));
        }
        System.out.println("Using Lambda Function");
        //:: scope resolution operator
        list.forEach(this::square);


        list.stream()
                .filter(e -> e % 2 == 0)
                .filter(e -> e % 3 == 0)
                .forEach(this::print);


        ArrayList<Integer> subList = new
                ArrayList<>();
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i) % 2 == 0) {
                subList.add(list.get(i));
            }
        }
        for(int i = 0; i < subList.size(); i++){
            print(subList.get(i));
        }
        List<Integer> subList2 = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        subList2.forEach(this::print);
    }

    public void print(Integer i){
        System.out.println(i);
    }

    public void square(Integer i){
        System.out.println("Square of " + i + " = " + (i*i));
    }
}
