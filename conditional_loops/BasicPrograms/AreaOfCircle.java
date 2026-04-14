package BasicPrograms;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the radius :");
        int radius = input.nextInt();

        double area = 3.14 * radius * radius;

        System.out.println("area is " + area);
    }
    
}
