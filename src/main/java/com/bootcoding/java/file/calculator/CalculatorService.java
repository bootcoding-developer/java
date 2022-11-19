package com.bootcoding.java.file.calculator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CalculatorService {

    public void process(List<Number> numbers){
//        numbers.forEach(number -> {
//
//        });
//
        for(Number number : numbers){
            add(number);
            sub(number);
            mul(number);
        }

    }

    private void add(Number number){
        List<Integer> numbers = number.getNumbers();
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        number.setAddition(sum);
    }

    private void sub(Number number){
        List<Integer> numbers = number.getNumbers();
        Collections.sort(numbers);
        int sub = 0;
        for(int i = 0; i < numbers.size(); i++){
            sub = numbers.get(i) - sub;

        }
        number.setSubtraction(sub);
    }

    private void mul(Number number){
        List<Integer> numbers = number.getNumbers();
        long mul = 1;
        for(int i = 0; i < numbers.size(); i++){
            mul = mul * numbers.get(i);
        }
        number.setMultiplication(mul);
    }
}
