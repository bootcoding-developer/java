/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.assignments.account;

public class AccountBalanceChecker {

    public static void main(String[] args) {
        AccountBalanceChecker accountBalanceChecker = new AccountBalanceChecker();
        double remainingBalance = accountBalanceChecker.checkAccountBalance("12323,1000,100,200,500");
        System.out.println("The remaining balance : " + remainingBalance);
    }
    public double checkAccountBalance(String accountBalanceSheet){
        // "12323,1000,100,200,500" - return 200 as remaining balance

        String[] tokens = accountBalanceSheet.split(",");
        Account account = new Account();
        account.setAccountNumber(Integer.valueOf(tokens[0]));
        account.setInitialBalance(Integer.valueOf(tokens[1]));
        for(int  i=2; i< tokens.length; i++){
            account.addTransaction(Double.valueOf(tokens[i]));
        }
        double totalWithdrawlAmount = 0;
        for(double amount : account.getWithdrawTransactions()){
            totalWithdrawlAmount += amount;
        }
        return account.getInitialBalance() - totalWithdrawlAmount;
    }
}
