package array;
import java.util.Arrays;
public class sortarraybuiltin {
    public static void main(String[] args){
        int[] arr={223,-23,-3,22,3,1,};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
