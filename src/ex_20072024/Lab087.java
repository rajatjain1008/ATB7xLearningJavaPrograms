package ex_20072024;
import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
// take input number and check whether it is odd or even

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check odd or even");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if (user_input%2 == 0) {
            System.out.printf("Number is even");
        }else{
            System.out.printf("Number is odd");


        }






    }
}
