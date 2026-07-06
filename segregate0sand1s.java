package array;
class segregate0sand1s {
        //2nd type of solution
    void segregate(int [] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i>j)break;
            if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
i++;
j--;
            }
        }

    }
    //1st type of solution
   // class Solution {
     //   void segregate0and1(int[] arr) {
       //     // code here
          //  int n=arr.length;
         //   int noofzero=0;
           // for(int i=0;i<n;i++){
             //   if(arr[i]==0) noofzero++;
            //}
            //for(int i=0;i<noofzero;i++){
              //  arr[i]=0;
//            }
  //          for (int i=noofzero;i<n;i++){
    //            arr[i]=1;
      //      }
        //}

    }


