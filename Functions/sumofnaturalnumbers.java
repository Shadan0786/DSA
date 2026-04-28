package Functions;

import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter nth digit ");
        int n = sc.nextInt();
        System.out.println(naturalsum(n));
    }

    static int naturalsum(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
}
