public class Nth_fibonacci {
    static int nthfibonacci(int n){
        if (n <= 1) {
            return n;
        }

        return nthfibonacci(n-1)+ nthfibonacci(n-2);
    }

    public static void main(String[] args){
        int n = 4;
        int result = nthfibonacci(n);
        System.out.println(result);
    }
}
