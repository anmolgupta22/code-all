package Sorting;

import java.util.Arrays;

public class selection_sort {
    public static int[] selection(int[] arr,int n){
        int min;
for(int i=0;i<n;i++){
    min=i;
    for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]) {
            min = j;

            int temp = arr[min];//7
            arr[min] = arr[i];//1
            arr[i] = temp;
        }
    }
}
        return arr;
    }
    public static void main(String[] arg){
        int[] arr={23,24,11,77,10,7,24,33};
        int n= arr.length;
        System.out.println(Arrays.toString(selection(arr,n)));
    }
}
