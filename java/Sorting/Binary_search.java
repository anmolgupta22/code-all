package Sorting;

public class Binary_search {
    public static int binary(int[] arr,int st,int end,int key){
        int mid;
        while(st<=end){

             mid= (st+end)/2;
             if(arr[mid]==key){
                 return mid;
             }
             if(arr[mid]<key){
                 st=mid+1;
             }
             else
                 end=mid-1;
        }
       return -1;

    }
    public static void main(String[] arg){
        int[] arr={10,20,40,50,60,70};
        int key=60;
        int n=arr.length;
        System.out.print(binary(arr,0,n, key));

    }
}
