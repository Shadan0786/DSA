import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number : ");
        int num1 = input.nextInt();
        
        System.out.print("enter second number : ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("num1 ia greater than num2");
        }else if (num2 > num1) {
            System.out.print("num2 is greater than num1");
        }

    }
}
