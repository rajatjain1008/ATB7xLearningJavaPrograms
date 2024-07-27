package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
//        enter which browser need to start

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which browser you want start");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
            case "safari":
                System.out.println("Starting safari browser");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            default:
                System.out.println("browser not available");
                break;

        }
        System.out.println("---------------+++++++++++++-----------------");





    }
}
