/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.assignments.loan;

public class App {
    public static void main(String[] args) {
        double amount = 100000;
        int years = 5;
        double interest = 10;
        PersonalLoan pl = new PersonalLoan();
        double totalPayableAmount = pl.calculateInterest(amount, years, interest);
        System.out.println("Personal Loan Amount: " + amount
                + " Total Loan Payable Amount :" + totalPayableAmount);

        CarLoan cl = new CarLoan();
         totalPayableAmount = cl.calculateInterest(amount, years, interest);
        System.out.println("Car Loan Amount: " + amount
                + " Total Loan Payable Amount :" + totalPayableAmount);

        HomeLoan hl = new HomeLoan();
        totalPayableAmount = hl.calculateInterest(amount, years, interest);
        System.out.println("Home Loan Amount: " + amount
                + " Total Loan Payable Amount :" + totalPayableAmount);

        ILoan loan = loanFactory();
        loan.calculateInterest(amount, years, interest);
        test(hl);
    }
    // loosely coupled
    public static void test(ILoan loan){
        loan.calculateInterest(1,2,4);
    }

    // tightly coupled
    public static void test2(HomeLoan loan){
        loan.calculateInterest(1,2,4);
    }




    public static ILoan loanFactory(){
        return new PersonalLoan();
    }
}
