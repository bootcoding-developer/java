package com.bootcoding.java.oops;

public class Cricket {

    int score;
    String stadium;
    int overs;

    boolean toss(){
        return true;
    }

    boolean calculateWinner(){
        return true;
    }


    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.toss();
    }

}
