package BasicPrograms;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter width of triangle:");
        int base = input.nextInt();
        System.out.print("enter perpendicular height of triangle:");
        int height = input.nextInt();
        
        double area = 0.5 * base * height;
        System.out.println("area of triangle is :" + area );
    }
}
