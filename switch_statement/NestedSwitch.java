package switch_statement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empid = sc.nextInt();
        // String department = sc.next();

        switch (empid) {
            case 1:
                System.out.println("kunal");
                break;

            case 2:
                System.out.println("puja");
                break;

            case 3:
                String department = sc.next();
                switch (department) {
                    case "IT":
                        System.out.println("this is IT department");
                        break;
                    case "electrical":
                        System.out.println("this is electrical department");
                        break;

                    default:
                        System.out.println("enter a valid department");
                        break;
                }
                break;
            default:
                System.out.println("enter valid empid");

        }
    }
}
