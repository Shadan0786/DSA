package IntermediateProgram;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of the product : ");
        int amount = sc.nextInt();
        System.out.println("enter the amount of commission : ");
        int commission = sc.nextInt();


        double commission_percentage = ((double)commission / amount) * 100;

        System.out.println("commission percentage is : " + commission_percentage);
    }
}
