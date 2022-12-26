package com.bootcoding.java.methods;

public class MessagePrinter {


    public static void main(String[] args) {
        printBasicArithmeticOperation(10, 20);
    }





    // Defining method
    public static void printBasicArithmeticOperation(int x, int y){
        int addRes = add(x, y); // calling add() method
        int subRes = sub(x, y); // calling sub() method
        int mulRes = mul(x, y); // calling mul() method
        double divRes = div(x, y); // calling div() method


        // calling print() method with message
        print("Addition of " + x + " and " + y + " = " + addRes);
        print("Subtraction of " + x + " and " + y + " = " + subRes);
        print("Multiplication of " + x + " and " + y + " = " + mulRes);
        print("Division of " + x + " and " + y + " = " + divRes);

    }


    public static int add(int xx, int yy){
        return xx + yy;
    }
    public static int sub(int xl, int yl){
        return xl - yl;
    }
    public static int mul(int x, int y){
        return x * y;
    }
    public static double div(double x, double y){
        return x / y;
    }


    public static void print(String message){
        System.out.println(message);
    }


}

