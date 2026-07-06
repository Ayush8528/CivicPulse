package array;

import java.util.Scanner;

public class printnegativenoonly {
    public static void main(String[] args){
        int neg[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=1;i<neg.length; i++){
            System.out.println("enter the value of array: "+ i);
            neg[i]=sc.nextInt();
        }
        for(int i=1;i<neg.length;i++){
        if(neg[i]<0){
            System.out.println(neg[i]);
        }
        }
    }}
