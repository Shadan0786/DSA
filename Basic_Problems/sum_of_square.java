package Basic_Problems;

public class sum_of_square {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i * i;

        }
        System.out.println("sum of the squares of the natural numbers are : " + sum);
    }
    
}
