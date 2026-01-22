public class paircubecount {
    static int countpairs(int n){
        int count = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 0; b <= n; b++) {
                if (a*a*a + b*b*b == n) {
                    count++;
                }
                
            }
            
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countpairs(9));
    }
}
