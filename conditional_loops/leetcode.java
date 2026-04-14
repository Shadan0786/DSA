import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter num1 : ");
        int num1 = input.nextInt();
        System.out.print("enter num1 : ");
        int num2 = input.nextInt();

        double product = num1 * num2;

        double sum = num1 + num2;

        double subtract = product - sum ;

        System.out.println("difference of the product and sum of numbers : " + subtract);

    }
}
