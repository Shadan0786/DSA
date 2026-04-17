package IntermediateProgram;

import java.util.Scanner;



class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth number :  ");
        int n = sc.nextInt();
       
        int sum = (n*(n+1))/2;
        
        System.out.println("sum is : " + sum);
    }
    
}
