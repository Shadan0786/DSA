package conditional_loops;

import java.util.Scanner;

public class AreaOfEquiTriangle {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("enter length of the side : ");
        int side = input.nextInt();

        double area =( Math.sqrt(3)/4)*side*side;

        System.out.println("area of equilateral triangle is : " + area);
    
    }
}
