package array;

import java.util.Scanner;

public class pritnsumofeachelement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value of array  "+i);
        arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }}
