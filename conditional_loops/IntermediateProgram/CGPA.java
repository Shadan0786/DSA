package IntermediateProgram;

import java.util.Scanner;

public class CGPA {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter total number of obtained marks : ");
    double obtainedmarks = sc.nextDouble();

    System.out.print("enter total number of marks : ");
    double totalmarks = sc.nextDouble();

    double result = (obtainedmarks/totalmarks) * 10;

    System.out.println("the obtained CGPA is : " + result);
}
}