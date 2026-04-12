import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter principle : ");
        float P = input.nextFloat();

        System.out.print("enter rate : ");
        float R = input.nextFloat();

        System.out.print("enter time : ");
        float T = input.nextFloat();

        float si = (P*R*T)/100;

        System.out.print("simple interest is :" + si);
    }
}
