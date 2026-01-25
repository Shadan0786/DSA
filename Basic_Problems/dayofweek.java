public class dayofweek {
    public static void main(String[] args) {
        int d = 15;
        int m = 8;
        int y = 2003;

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String[] days = {
                "Saturday", "Sunday", "Monday",
                "Tuesday", "Wednesday", "Thursday", "Friday"
        };

        
        System.out.println("Day of the week is: " + days[h]);
    }
}
