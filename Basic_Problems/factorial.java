public class factorial {
    static int Factorial(int n){
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args){
        
        System.out.println(Factorial(5));
        
        //second option
        
        // int n = 5;
        // int ans = 1;
        // for (int i = 2; i <= n; i++) {
        //     ans = ans * i;
        // }
        // System.out.println( ans);
    }
}
