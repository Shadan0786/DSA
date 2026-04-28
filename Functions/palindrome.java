package Functions;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter a number ");
    int num = sc.nextInt();

    System.out.println("num is " + ispalindrome(num));
}

static String ispalindrome(int num){

    int original = num;
    int reversed = 0;

    while (num > 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num = num / 10;
    }
    
    if (original == reversed) {
        return "palindrome";

    }else{
        return "not palindrome";
    }
}
    
}