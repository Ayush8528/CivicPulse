package array;
import java.util.Scanner;
public class searchinarray {
    public static void main(String[] args) {
//2nd approach
    int arr[]={12,3,27,18,62,88,6,53};
    int target=-1;
    int found =-1;
    for(int i=0; i<arr.length;i++){
        if(arr[i]==target){
            found=i;
            break;}}
    if(found!=-1) System.out.println("target exist in array at index" +found);
    else System.out.println("target missing in Array");



        //1st approach
        //Scanner sc= new Scanner(System.in);
          //    int arr[]={12,33,2,566,4};
        //System.out.println("enter the value you want to search:");
        //int sv=sc.nextInt();
        //boolean found=false;
        //for(int i=0;i<arr.length;i++){
          //  if(arr[i]==sv){
            //    System.out.println("Yes it is in : "+arr[i] );
              //  found=true;
                //break;
            //}  }
            //if(found==false){
              //  System.out.println("not found");
            //}
        }
    }
