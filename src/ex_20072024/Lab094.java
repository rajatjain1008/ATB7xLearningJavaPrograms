package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
//        check number is vowel or consonant

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet to check it is vowel or consonant");
        char alphabet = sc.next().charAt(0);
        System.out.println(alphabet);

        switch (alphabet){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
        System.out.println("-----------++++++-----------");






    }
}
