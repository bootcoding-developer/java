package com.bootcoding.java.file.calculator;

import java.util.List;

public class Number {

    private List<Integer> numbers; // {1,23,5,66} - sum
    private int addition;
    private int subtraction;
    private long multiplication;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getAddition() {
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public int getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(int subtraction) {
        this.subtraction = subtraction;
    }

    public long getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(long multiplication) {
        this.multiplication = multiplication;
    }
}
