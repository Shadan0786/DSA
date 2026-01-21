public class istriangle {

    static boolean triangle(int a,int b,int c){
        if (a+b <= c || b+c <= a|| c+a<= b) {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(triangle(10, 20, 50));
    }
}