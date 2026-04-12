package Java_codes;
// Input a year and find whether it is a leap year or not.

// public class flowOfControl{
// public static void main(String[] args){
// int year = 2004;
// if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
// System.out.println(year + " is a leap year");
// }else{
// System.out.println(year + " is not a leap year");
// }
// }
// }

// Take two numbers and print the sum of both.

// public class flowOfControl{
// public static void main(String[] args){
// int num1 = 44;
// int num2 = 78;
// int sum = num1 + num2;
// System.out.println("sum is " + sum);
// }
// }

// Take a number as input and print the multiplication table for it.

// public class flowOfControl{
// public static void main(String[] args){
// int table = 4;

// for (int i = 1; i <= 10; i++) {
// System.out.println(table*i);
// }
// }
// }

// Take 2 numbers as inputs and find their HCF and LCM.

// public class flowOfControl {
// public static void main(String[] args) {
// int num1 = 12;
// int num2 = 18;

// int a = num1;
// int b = num2;

// while (num1 != num2) {
// if (num1 > num2) {
// num1 = num1 - num2;
// } else {
// num2 = num2 - num1;
// }
// }
// int hcf = num1;
// int lcm = (a * b) / hcf;

// System.out.println("lcm is " + lcm);
// System.out.println("hcf is " + hcf);
// }
// }

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

// import java.util.Scanner;

// public class flowOfControl {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int sum = 0;
// String input = "4";

// System.out.println("Enter numbers to sum (type 'x' to finish):");

// while (!input.equals("x")) {
// input = sc.next();

// if (!input.equals("x")) {

// sum += Integer.parseInt(input);
// }
// }

// System.out.println("Final Sum: " + sum);
// sc.close();
// }
// }