package IntermediateProgram;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hits: ");
        int hits = input.nextInt();

        System.out.print("Enter the number of at-bats: ");
        int atBats = input.nextInt();

        float batAvg = (float) hits / atBats;

        System.out.println("Batting average: " + batAvg);
        
    }
}
