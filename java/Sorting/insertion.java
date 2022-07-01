package Sorting;

import java.util.Arrays;

public class insertion {
    public static int[] insert(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String [] arg){
        int[] arr={23,24,11,77,10,7,24,33};
        int n= arr.length;
        System.out.print(Arrays.toString(insert(arr,n)));
    }
}
