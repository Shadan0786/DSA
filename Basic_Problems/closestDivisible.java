package Basic_Problems;

public class closestDivisible {

    public static int closestDivisible(int number, int divisor) {
        int lower = (number / divisor) * divisor;
        int higher = lower + divisor;

        if (number - lower <= higher - number) {
            return lower;
        } else {
            return higher;
        }
    }

    public static void main(String[] args) {
        int number = 13;
        int divisor = 4;
        System.out.println("Closest number divisible by " + divisor + " is: "
                + closestDivisible(number, divisor));
    }

}