package com.bootcoding.java.assignments;

public class GradeSystem {

    public static void main(String[] args) {
        int[] studentPercentages = {67,58,99,69,35,87};
        char[] gradeResults = calculateGrade(studentPercentages);
        for(int i = 0 ; i < gradeResults.length; i++){
            System.out.println(studentPercentages[i] + " -> " + gradeResults[i]);
        }
    }
    public static char[] calculateGrade(int[] studentPercentages){
        char[] grades  = new char[studentPercentages.length];
        for(int i=0; i<studentPercentages.length; i++){
            char grade ;
            int percentage = studentPercentages[i];
            grade = getGrade(percentage);
            grades[i]=grade;
        }
        return grades;
    }

    private static char getGrade(int percentage) {
        char grade;
        if(percentage >= 75){
            grade = 'A';
        }else if(percentage >=60){
             grade = 'B';
        }else{
             grade = 'C';
        }
        return grade;
    }
}
