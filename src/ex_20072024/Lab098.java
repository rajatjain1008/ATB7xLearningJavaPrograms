package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {


        int item_code = 001;
        switch (item_code){
            case 001 -> System.out.println("laptop");
            case 002,003,004 -> System.out.println("desktop");
            case 005,006,007 -> System.out.println("tablet");
            default -> System.out.println("no gadget");
        }
    }
}
