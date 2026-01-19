package Basic_Problems;

public class swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a is " + a + " b is " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a + " b is " + b);
    }
}
