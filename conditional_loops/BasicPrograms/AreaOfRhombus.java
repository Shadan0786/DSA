package BasicPrograms;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of first diameter : ");
        int d1 = input.nextInt();
        System.out.print("enter length of second diameter : ");
        int d2 = input.nextInt();

        double area = 0.5 * d1 * d2;
        System.out.println("area of rhombus is : " + area);
    }
}
