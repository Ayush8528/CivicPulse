package array;
//twopointertechnic
public class reversearr {
    public static void main(String[] args) {
      //swap only arr[2]to arr[5]  &&reverse partofarray
        int ar[]={3,44,44,22,3,57,42,4};
        int nu=ar.length;
        int i=2,j=5;
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
        for(int ele:ar){
            System.out.print(ele +" ");
        }
       //2nd process
       // int ar[]={3,44,44,22,3,57,42,4};
       // int nu=ar.length;
       // int i=0,j=nu-1;
        //while(i<j){
            //int temp=ar[i];
            //ar[i]=ar[j];
            //ar[j]=temp;
           // i++;
         //   j--;
       // }
        //for(int ele:ar){
         //   System.out.print(ele +" ");
        //}
       //1st process
        //int arr[]={12,233,2,3,2};
       // int n=arr.length;
        //for(int i=n-1;i>=0;i--){
          //  System.out.print(arr[i] +" ");
        //}
    }
}
