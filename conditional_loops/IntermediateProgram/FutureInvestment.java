import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter investment amount (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter annual interest rate (r): ");
        double r = sc.nextDouble();

        System.out.print("Enter number of years (t): ");
        int t = sc.nextInt();

        double futureValue = P * Math.pow((1 + r / 100), t);

        System.out.println("Future Investment Value = " + futureValue);
    }
}