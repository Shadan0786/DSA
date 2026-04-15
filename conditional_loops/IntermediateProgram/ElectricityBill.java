package IntermediateProgram;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of units consumed : ");
        int units = input.nextInt();
        double billtopay = 0;

        if (units <= 100) {
            billtopay = units * 1.20;
        } else if (units <= 200) {
            billtopay = 100 * 1.20 + (units - 100) * 2.00;
        } else {
            billtopay = 100 * 1.20 + 200 * 2.00 + (units - 200) * 3.00;
        }
        System.out.println("The electricity bill for " + units + " units is: " + billtopay);
    }
}
