import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius ");
        int radius = sc.nextInt();

        System.out.println("perimeter of a circle is " + perimeter(radius) + " and the area of a circle is " + area(radius));
    }

    static double perimeter(int radius){
        double peri = 2* 3.14 * radius;
        return peri;
    }

    static double area(int radius){
        double ar = 3.14 * (Math.sqrt(radius));
        return ar;
    }
}
