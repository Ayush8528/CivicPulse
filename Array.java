package array;

public class Array {
    public static void main(String[] args) {
//2Darray
        //min
        int arr[][]={{1,2,3},{13,3,4}};
        int minvalue=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<minvalue){
                    minvalue=arr[i][j];
                }
            }

        }
        System.out.println(minvalue);

        //maxvalue
//int arr[][]={{1,2,3},{1,2,3}};
//int maxvalue=arr[0][0];
//for(int i=0;i<arr.length;i++){
  //  for(int j=0;j<arr[i].length;j++){
    //    if(arr[i][j]>maxvalue);{
     //   maxvalue=arr[i][j];
    //}}}

      //  System.out.println(maxvalue);


//mul
        //int arr[][]={
          //      {1,2,3},
            //    {1,2,3}
        //};
        //int ans=1;
        //for(int i=0;i<=arr.length-1;i++){
          //  for(int j=0;j<=arr[i].length-1;j++){
            //    int value=arr[i][j];
              //  ans=ans*value;
            //}
        //}

        //System.out.println(ans);
        //add
        //int sum=0;
        //for(int i=0;i<arr.length;i++){
          //  for(int j=0;j<arr[i].length;j++) {
            //    int value = arr[i][j];
              //  sum = sum + value;
           // }
            //}
            //System.out.println(sum);




        //take user input
       // int arr[][]=new  int[3][4];
        //Scanner sc=new Scanner(System.in);
        //for(int i=0;i<=arr.length-1;i++){
          //  for(int j=0;j<=arr[i].length-1;j++){
            //    System.out.println("provide values for row=" +i+ "and column=" +j);
              //  arr[i][j]=sc.nextInt();
            //}

        //}


        //int[][] brr = {
          //      {1, 2, 3},
            //    {2, 3, 3, 33, 3, 3},
              //  {2, 32, 32, 2, 2, 2},
               // {2, 23, 2, 2, 2},
        //};
        //traversal 2-D array
        //for (int rowindex = 0; rowindex <= brr.length - 1; rowindex++) {
          //  for (int colindex = 0; colindex <= brr[rowindex].length - 1; colindex++) {
            //    System.out.print(brr[rowindex][colindex] + " ");

        //}
        //System.out.println();
    //}
        //int rowlength=brr.length;
        //for(int rowindex=0;rowindex<=rowlength-1;rowindex++){
          //  int collength=brr[rowindex].length;
            //for(int colindex=0;colindex<=collength-1;colindex++){
              //  System.out.print(brr[rowindex][colindex] + " ");
            //}
            //System.out.println();
       // }

//declaration
        //int[][] arr;
        //arr=new int[3][4];
        //init
        //int [][]brr={{1,2},{2,3},{2,1},{2,3}};
        //print
        //System.out.println(brr[0][0]);
//print all the elemnts in the array
        //int rowlength=brr.length;
        //int collength=brr[0].length;

        //for (int rowindex=0;rowindex<=rowlength-1;rowindex++){
          //  for(int colindex=0;colindex<=collength-1;colindex++){
            //    System.out.print(brr[rowindex][colindex] + " ");
            //}
            //System.out.println();
        //}
        //min value find
//int arr[]={12,2,3,1,34};
//int n= arr.length;
//int minvalue=arr[0];
//for(int i=0;i<=n-1;i++){
  //  if(arr[i]<minvalue){
        //minvalue=arr[i];

    //}}
      //  System.out.println(minvalue);
        //find the max value inside the array
//int arr[ ]={3,4,42,323,43};
//int n=arr.length;
//int maxvalue=arr[0];
//for(int i=0; i<=n-1;i++){
  //  if(arr[i]>maxvalue){
    //    maxvalue=arr[i];
    //}
//}
  //      System.out.println(maxvalue);

        //mul
        //int arr[]={2,3,4,5};
        //int n= arr.length;
        //int ans=1;
        //for(int i=0; i<=n-1;i++){
          // int value =arr[i];
          // ans=ans*value;
        //}
        //System.out.println(ans);



        //sum
        //int arr[]={12,21,21,21};
        //int sum=0;
        //int n=arr.length;
        //for (int i=0;i<=n-1;i++){
          //  int value=arr[i];
        //sum= sum+ value;

        //}
       // System.out.println(sum);
       // int n= arr.length;
        //for (int i=0;i<=n-1;i++){
          //  System.out.println(arr[i]);

        // }



       // int arr[]= new int[5];
  //Scanner sc =new Scanner(System.in);
  //int n =arr.length;
//for(int i=0;i<=n-1;i++) {
  //  System.out.println("input for index " + i);
    //arr[i] = sc.nextInt();
//}
  //      System.out.println("your array contains");
//for(int val: arr) {
  //  System.out.println(val);
//}

        //declaration
        //int arr[];
        //allocation
        //arr=new int[5];
        //init
        //int brr[]={13,42,33,86,976};
        //int n= brr.length;
        //for(int val:brr){
          //  System.out.println(val);

        //}
        //for(int index=0;index<=n-1;index++){
          //  System.out.println(brr[index]);

        //}


        //System.out.println("Value at 0 index:- " + brr[0]);
        //System.out.println("Value at 2 index:- "+ brr[2]);
    }
}
