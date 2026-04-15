package IntermediateProgram;

import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n :");

        double n = input.nextInt();

        double average = ((n*(n + 1))/2)/n;

        System.out.println("average is : " + average);
    }
}
