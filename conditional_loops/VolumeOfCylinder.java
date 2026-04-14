import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius: ");
        int r = input.nextInt();

        System.out.println("enter the height of cylinder: ");
        int h = input.nextInt();

        double volume = 3.14 * r * r * h;

        System.out.println("volume of a cylinder " + volume);

    }
}
