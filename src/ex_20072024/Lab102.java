package ex_20072024;

public class Lab102 {
    public static void main(String[] args) {

        int a = 56;
        switch (-2){
            case -1 -> System.out.println("wrong case");
            case -2 -> System.out.println("correct case");
            case -3,-4,-5 -> System.out.println("Wrong order case");
            default -> System.out.println("hello");

        }


    }
}
