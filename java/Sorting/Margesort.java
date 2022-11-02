package Sorting;
public class Margesort
{
    public static void divide(int[] arr, int st, int end)
    {
        if(st>=end){
            return;
        }
        int mid =(st+end)/2;
        divide(arr, st, mid);
        divide(arr,mid+1,end);
        conquer(arr,st,mid,end);

    }
    public static void conquer(int arr[],int st,int mid ,int end){
        int[] marged= new int[end-st+1];
        int n=st;
        int m=mid+1;
        int x=0;
        while(n<=mid && m<=end){
            if(arr[n]<=arr[m]){
                marged[x++]=arr[n++];
            }
            else
                marged[x++]=arr[m++];
        }
        while(n<=mid){
            marged[x++]=arr[n++];
        }
        while (m<=end){
            marged[x++]=arr[m++];

        }
        for(int i=0, j=st; i<marged.length;i++,j++)
        {
arr[j]=marged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr ={22,11,33,12,44,04,34} ;
        int n=arr.length;
        divide(arr, 0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
}
