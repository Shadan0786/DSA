package conditional_loops;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter length of rectangle:");
        int length = input.nextInt();
        System.out.print("enter width of rectangele:");
        int width = input.nextInt();

        double area = length * width;

        System.out.println("area of rectangle : " + area );
    }
}
