package ex_20072024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
//        print electronic on number 1,2,3 and gadget on 4,5,6
//        take input upto 10 number and 7,8,9,10 toys
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number btw 1 to 10 to know type of item");
        int item_code = sc.nextInt();

        switch (item_code){
            case 1,2,3 -> System.out.println("Electronic item");
            case 4,5,6 -> System.out.println("gadget item");
            case 7,8,9,10 -> System.out.println("toys item");
            default -> System.out.println("No item available");
        }
        System.out.println("----------++++++++++----------");





    }
}
