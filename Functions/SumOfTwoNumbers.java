package Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a ");
        int a = sc.nextInt();
        System.out.println("enter value of b ");
        int b = sc.nextInt();
        int result = sum(a,b);
        System.out.println("sum of two number is " + result);
    }

    static int sum(int a , int b){
        int sum = a + b ;
        return sum;
    }
    
}