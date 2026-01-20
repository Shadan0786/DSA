package Basic_Problems;

public class PowerOfNum {
    public static boolean isPower(int x, long y) {
        if (x == 1) {
            return (y == 1);
        }

        long pow = 1;
        while (pow < y) {
            pow = pow * x;
        }
        return (pow == y);
    }

    public static void main(String[] args) {
        System.out.println(isPower(10, 1));
        System.out.println(isPower(1, 20));
        System.out.println(isPower(2, 128));
        System.out.println(isPower(2, 30));
    }
}
