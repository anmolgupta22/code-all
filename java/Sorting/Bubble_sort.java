package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static int[] bubble(int[] arr, int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1])
                {
                   temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] arg){
        int[] arr={23,24,11,77,1,7,24,33};
        int n= arr.length;
        System.out.print(Arrays.toString(bubble(arr, n)));
    }
}
