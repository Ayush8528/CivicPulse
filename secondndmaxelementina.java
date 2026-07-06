package array;

public class secondndmaxelementina {
    public static void main(String[] args){
int arr[]={12,2,21,23,22};
    int max=Integer.MIN_VALUE;
    int smax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
        if (max < arr[i])
            max = arr[i];
    }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max)
                smax=arr[i];


    }
        System.out.println(max);
        System.out.println(smax);
}
}
