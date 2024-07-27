package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
//         Program to Check
//         if a Number is Positive
//         , Negative,
//         or Zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is positive,negative,zero");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Positive");
        }else if (num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }
}
