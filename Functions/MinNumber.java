package Functions;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1");
        int num1 = sc.nextInt();

        System.out.println("enter num2");
        int num2 = sc.nextInt();

        System.out.println("enter num3");
        int num3 = sc.nextInt();

        int result = minimum(num1, num2, num3);
        System.out.println("minimum is " + result);
    }

    static int minimum(int num1 , int num2 ,int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;

        }
        return min;
    }
}
