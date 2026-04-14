package BasicPrograms;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int x = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = input.nextInt();
        while (num != 0) {
            x += num ;
            System.out.print("enter a number again: ");
            num = input.nextInt();
            
        }
        System.out.println("sum of the all entered numbers :" + x);
    }
}
