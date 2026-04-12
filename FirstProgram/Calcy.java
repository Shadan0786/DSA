import java.util.Scanner;

public class Calcy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter first number : ");
        int num1 = input.nextInt();

        System.out.print("enter second number : ");
        int num2 = input.nextInt();

        System.out.print("enter operator : ");
        String operator = input.next();

        if (operator.equals("+")) {
            System.out.println("sum is " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("sub is " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("mul is " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.println("div is " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }

        input.close();
    }
}