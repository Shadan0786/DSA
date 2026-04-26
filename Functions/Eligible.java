package Functions;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  age of person ");
        int age = sc.nextInt();

        System.out.println("person is " + eligibility(age) + " to vote");

    }

    static String eligibility(int age){
        if (age >= 18) {
            return "eligible";
        }else{
            return "not eligible";
        }
    }
}
