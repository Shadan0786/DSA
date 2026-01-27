public class decimal_to_binary {
    static String dectobinary(int n){
        StringBuilder bin = new StringBuilder();

        while (n>0) {
            int bit = n % 2;
            bin.append((char)('0' + bit));
            n /= 2;
        }

        bin.reverse();
        return bin.toString();
    }

    public static void main(String[] args){
        int n = 12;
        System.out.println(dectobinary(n));
    }
}
