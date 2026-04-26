package switch_statement;

import java.util.Scanner;

public class lecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        // String s1 = "shafan";
        // String s2 = "shafan";
        // System.out.println(s1 == s2 );
        // if (s1.equals(s2)) {
        // System.out.println("it is equals");
        // }

        switch (fruit) {
            case "mango":
                System.out.println("king of all fruit");
                break;
            case "apple":
                System.out.println("it is red in color");
                break;
            case "banana":
                System.out.println("yellow in color long in shape");
                break;

            default:
                System.out.println("enter a valid number");

        }
    }
}