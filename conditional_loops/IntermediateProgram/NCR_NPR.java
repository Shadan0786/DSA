import java.util.Scanner;

public class NCR_NPR {

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        long nPr = factorial(n) / factorial(n - r);
        long nCr = factorial(n) / (factorial(r) * factorial(n - r));

        System.out.println("nPr = " + nPr);
        System.out.println("nCr = " + nCr);
    }
}