

import java.util.Scanner;

class PerimeterOFCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the radius of a circle: ");
        int r = input.nextInt();

        double perimeter = 2 * 3.14 * r;

        System.out.println("perimeter of a circle : " + perimeter);
    }

}