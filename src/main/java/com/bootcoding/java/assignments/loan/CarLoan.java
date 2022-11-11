/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.assignments.loan;

public class CarLoan implements ILoan{
    // slightly different logic
    public double calculateInterest(double amount, int noOfYears, double interest){
        double interestMultiplier = 1 + 0.2 + interest / 100;
        double totalPayableAmount = amount;
        for(int i = 0; i < noOfYears; i++){
            totalPayableAmount = totalPayableAmount * interestMultiplier;
        }
        return totalPayableAmount;
    }



}
