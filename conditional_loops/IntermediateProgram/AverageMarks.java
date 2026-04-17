package IntermediateProgram;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter total marks : ");
        double totalmarks = sc.nextDouble();

        System.out.println("enter total number of subject : ");
        double n = sc.nextDouble();

        if (n != 0) {
            double result = totalmarks/n;
            System.out.println("avrage of marks is : " + result);
        }
    }
}
