import java.util.Scanner;

public class ProductOfNumbers {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a ");
        int a = sc.nextInt();
        System.out.println("enter value of b ");
        int b = sc.nextInt();
        int result = productnumbers(a,b);
        System.out.println("sum of two number is " + result);
    }

    static int productnumbers(int a , int b){
        int product = a * b ;
        return product;
    }
}
