package Array;

import java.util.Arrays;

public class array{
    public static void main(String[] arg ){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
      // System.out.print(Arrays.toString(arr1(arr, n)));
        System.out.print(Arrays.toString(arr2(arr, n)));
    }
    static int[] arr1(int[] arr , int n) {

        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
         // System.out.print(arr[i]+" ");
        }
      arr[0]=last;
       return arr;
    }

    static int[] arr2(int[] arr,int n){
        System.out.println();
        int k1=4;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
          a[(i+k1)%n]=arr[i];
        }
        return a;
    }
}
