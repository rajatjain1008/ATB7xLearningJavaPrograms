package ex_20072024;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
//check vowel

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to check vowel");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch =='e' || ch =='o' || ch == 'i' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("consonant");
        }


    }
}
