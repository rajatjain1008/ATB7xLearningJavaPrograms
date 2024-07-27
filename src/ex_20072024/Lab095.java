package ex_20072024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
//        check vowel number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alpabet to check vowel");
        char alpha = sc.next().charAt(0);
        System.out.println(alpha);

        switch (alpha){
            case 'a','e','i','o','u'-> System.out.println("Vowel");
            default -> System.out.println("consonant");
        }




    }
}
