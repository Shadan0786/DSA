package IntermediateProgram;

import java.util.Scanner;

public class DiscountOFProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marked price: ");
        double markedPrice = sc.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();
        
        double discountAmount = (markedPrice * discountPercent) / 100;
        double finalAmount = markedPrice - discountAmount;
        
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalAmount);
        
    }
}
