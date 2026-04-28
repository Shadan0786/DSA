import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks between 1 to 100 ");
        int marks = sc.nextInt();
        System.out.println("grade of a student is " + studentgrade(marks));

    }

    static String studentgrade(int marks) {
        if (marks <= 100 && marks > 90) {
            return "AA";
        } else if (marks < 90 && marks > 80) {
            return "AB";
        } else if (marks < 80 && marks > 70) {
            return "BB";
        } else if (marks < 70 && marks > 60) {
            return "BC";
        } else if (marks < 60 && marks > 50) {
            return "CD";
        } else if (marks < 50 && marks > 40) {
            return "DD";

        }else if (marks <= 40) {
            return "fail";
        }
        return "over performed";
    }
}
