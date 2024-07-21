package ex_20072024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
//        ✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        float score = sc.nextFloat();

        char grade = 'F';

        if (score >=90 && score <=100){
            grade = 'A';
            System.out.println("Your grade is --> "+grade);
        } else if (score >=80 && score <=89) {
            grade = 'B';
            System.out.println("Your grade is --> "+grade);
        }else if (score >=70 && score <=79) {
            grade = 'C';
            System.out.println("Your grade is --> "+grade);
        }else if (score >=60 && score <=69) {
            grade = 'D';
            System.out.println("Your grade is --> "+grade);
        }else{
            System.out.println("Fail");
        }


    }
}
