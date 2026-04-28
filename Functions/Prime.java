import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is prime or not:");
        int num = sc.nextInt();

        System.out.println(PrimeOrNotPrime(num));
    }

    static String PrimeOrNotPrime(int num) {
        if (num <= 1) {
            return "Not Prime";
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}