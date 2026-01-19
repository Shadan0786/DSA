package Basic_Problems;

public class Nth_term_of_AP {
    public static int nthtermofap(int a1 , int a2 , int n ){
        int nthterm = a1 , d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthterm += d;
        }  
        return nthterm;
    }

    public static void main(String[] args){
        int a1 = 2, a2 = 3;
        int n = 4;
        System.out.println(nthtermofap(a1, a2, n));
    }
}
