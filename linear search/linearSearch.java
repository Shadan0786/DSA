public class linearSearch {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7};
        int target = 4;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
               
            }
        }
        System.out.println("index is : " + index );
    }
}