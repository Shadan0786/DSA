package Functions;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        System.out.println("Enter num3:");
        int num3 = sc.nextInt();

        int result = maximum(num1, num2, num3);
        System.out.println("Maximum: " + result);
    }

    static int maximum(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}