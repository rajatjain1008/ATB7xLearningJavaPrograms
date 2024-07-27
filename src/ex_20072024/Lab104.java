package ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {

//        program to check maximum number in 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("1st number is maximum");
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("2nd number is maximum");
        }else {
            System.out.println("3rd number is maximum");
        }
    }
}
