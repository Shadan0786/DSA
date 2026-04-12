public class ArmstrongRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(i).length();

            while (num > 0) {
                int rem = num % 10;
                sum += Math.pow(rem, digits);
                num /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
