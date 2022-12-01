package com.bootcoding.java.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample1 {


    /// functional interface  - single abstract function

    // zero parameter/ argument function
    //  () -> 10 + 20;

    // one parameter/argument function
    // (x) -> x + 20;


    // two parameter / argument function
    // (x,y) -> x + y;

    interface calcFunction {
        int operation();
    }

    private int operate(calcFunction funcObject)
    {
        return funcObject.operation();
    }

    public static void main(String[] args) {

        // Functional Interface - treated as a function object
        calcFunction add = () -> 19 + 29;
        calcFunction mul = () -> 19 * 29;

        int a= 20;
        String s = new String();

        LambdaExample1 lambdaObject = new LambdaExample1();

        int result = lambdaObject.operate(add);
        int result2 = lambdaObject.operate(mul);

        // Add two numbers using lambda expression
        System.out.println("Addition is " + result);
        System.out.println("Multiplication is " + result2);
    }


    public void test(int x){
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
