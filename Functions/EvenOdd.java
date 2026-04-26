package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        System.out.println("number is " + multiple(num));
    }

    static String multiple(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
