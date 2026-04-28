import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();

        System.out.println("the factorial of a number is " + factorialofnumber(num));

    }

    static int factorialofnumber(int num){
        if (num == 1 || num == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num ; i++) {
            fact = fact*i;
        }
        return fact;
        
    }
}
