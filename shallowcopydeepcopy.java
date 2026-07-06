package array;
import java.util.Arrays;
public class shallowcopydeepcopy {
    public static void main(String[] args) {
        int [] arr={0,2,23,};
       // int [] x=arr;//x is shallow copy of arr
        //x[0]=100;
        System.out.println(arr[0]);
        int[] deep=Arrays.copyOf(arr,arr.length);
        deep[0]=111;
        System.out.println(arr[0]);
    }
}
