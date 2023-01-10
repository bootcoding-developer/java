package com.bootcoding.java.assignments;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Maths Marks :");
        int maths = scanner.nextInt();
        System.out.println("Enter Physics Marks :");
        int physics = scanner.nextInt();
        System.out.println("Enter Chemistry Marks :");
        int chemistry = scanner.nextInt();

        double percentage = calcPercentage(maths, physics, chemistry);
        double average = calcAverage(maths, physics, chemistry);
        char grade = calcGrade(percentage);

        System.out.printf(" %.2f", percentage);
//        System.out.println("Avg: " + average);
//        System.out.println("Grade:" + grade);
    }

    private static double calcAverage(int maths, int physics, int chemistry) {
        return (maths + physics + chemistry) / 3;
    }

    private static double calcPercentage(int maths, int physics, int chemistry) {
        double sum = maths + physics + chemistry;
        return (sum/300) * 100;
    }

    public static char calcGrade(double percentage){
         if(percentage >= 75){
             return  'A';
         }else if(percentage >= 55){
             return 'B';
         }
         return 'C';
    }
}
