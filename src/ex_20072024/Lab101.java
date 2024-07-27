package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
//        program to print age salary name grade

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);

        System.out.println("Name --->" + name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
    }
}
