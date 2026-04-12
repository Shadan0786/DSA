import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter currency in rupee : ");
        float Rupee = input.nextFloat();

        float usd = Rupee / 83;
        
        System.out.print("Rupee in usd is : " + usd);
    }
}
