/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.bootcoding.java.assignments.account;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int accountNumber;
    private double initialBalance;
    private List<Double> withdrawTransactions = new ArrayList<>();
    private double totalBalance;

    public void addTransaction(double amount){
        withdrawTransactions.add(amount);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public List<Double> getWithdrawTransactions() {
        return withdrawTransactions;
    }

    public void setWithdrawTransactions(List<Double> withdrawTransactions) {
        this.withdrawTransactions = withdrawTransactions;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
