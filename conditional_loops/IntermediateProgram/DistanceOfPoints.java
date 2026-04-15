package IntermediateProgram;

import java.util.Scanner;

public class DistanceOfPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first point coordinates (x1 y1): ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();

        System.out.print("Enter second point coordinates (x2 y2): ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between them = " + distance);
    }
}
