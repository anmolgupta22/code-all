package Sorting;

public class linear_search {
    public static int linear(int arr[],int key,int n){
        int flag=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                flag=i-1;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={23,24,11,77,1,7,24,33};
        int n=arr.length;
       int key=7;
       int count= linear(arr,key,n);
       System.out.print(count);
    }
}
