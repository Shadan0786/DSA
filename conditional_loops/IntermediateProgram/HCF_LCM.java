import java.util.Scanner;

public class HCF_LCM {
    
    // Function to find HCF (GCD)
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = hcf(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("HCF = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}