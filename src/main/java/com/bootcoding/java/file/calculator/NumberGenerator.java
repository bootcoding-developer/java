package com.bootcoding.java.file.calculator;

import java.util.Random;

public class NumberGenerator {

    private static final int MAX_NUMBER = 10;
    private static final int MAX_INPUT_PARAMETERS = 1;

    public static int getNumber(){
        Random random = new Random();
        return random.nextInt(MAX_NUMBER);
    }

    public static int getInputParameterCount(){
        Random random = new Random();
        return 2 + random.nextInt(MAX_INPUT_PARAMETERS);
    }

}
