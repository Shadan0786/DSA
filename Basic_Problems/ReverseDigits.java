package Basic_Problems;

public class ReverseDigits {
    static int reversedigits(int n){
        int revnum = 0;
        while(n>0){
            revnum = revnum * 10 + n % 10;
            n= n/10;
        }
        return revnum;
    }
    public static void main(String[] args) {
        int num = 4562;
        System.out.println(reversedigits(num));
    }
}
