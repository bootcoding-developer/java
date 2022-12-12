package com.bootcoding.java.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample2 {

    interface calcFunction {
        int operation(int x , int y);
    }

    private int operate(int x, int y, calcFunction funcObject)
    {
        return funcObject.operation(x , y );
    }

    public static void main(String[] args) {

        // Functional Interface - treated as a function object
        calcFunction add = (x,y) -> x + y;
        calcFunction mul = (x,y) -> x * y;

        int a= 20;
        String s = new String();

        LambdaExample2 lambdaObject = new LambdaExample2();

        int result = lambdaObject.operate(10, 20, add);
        int result2 = lambdaObject.operate(10, 20, mul);


        // Add two numbers using lambda expression
        System.out.println("Addition is " + result);
        System.out.println("Multiplication is " + result2);
    }

}
