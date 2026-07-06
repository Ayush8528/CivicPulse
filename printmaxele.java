package array;

import java.util.Scanner;

public class printmaxele {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
         for(int i=0;i<arr.length;i++){
             System.out.println("enter the value of array: "+i);
             arr[i]=sc.nextInt();
         }

         int max=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }

         }
        System.out.println("The maxvalue is" +max);
    }
}
