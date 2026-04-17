package IntermediateProgram;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();

        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();

        double amount = P * Math.pow((1 + R / 100), T);

        double CI = amount - P;

        System.out.println("Compound Interest = " + CI);
        System.out.println("Total Amount = " + amount);

    }
}
