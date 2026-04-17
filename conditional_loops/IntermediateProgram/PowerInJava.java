package IntermediateProgram;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println("enter the power: ");
        int power = sc.nextInt();

        double result = Math.pow(num, power);

        System.out.println("result is : " + result);
    }
}
