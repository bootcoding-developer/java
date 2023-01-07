package com.bootcoding.java.oops.assignment.discount;

import java.util.Random;

public class VisitCountGenerator {

    private static final int MAX = 1000;
    private static final int MIN = 1;
    private static Random random = new Random();

    public static int getVisitCount() {
        return MIN + random.nextInt(MAX - MIN);
    }
}
