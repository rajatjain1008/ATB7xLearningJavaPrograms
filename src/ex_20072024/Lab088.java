package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
//        Find the maximum number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2));

        if (num1 > num2) {
            System.out.println("Num1 is maximum");
        }else if(num2 > num1){
            System.out.println("Num2 is maximum");
        }else {
            System.out.println("Number is equal");
        }


    }
}
