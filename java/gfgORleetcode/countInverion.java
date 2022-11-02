package gfgORleetcode;

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for(long i = 0; i < n; i++)
                arr[(int)i] = sc.nextLong();

            System.out.println(new countInverion().inversionCount(arr, n));

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class countInverion
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.

    static long inversionCount(long arr[], long N)
    {

        return mergesort(arr, 0, (int)N-1);
    }
    static  long conquer(long arr[],int l,int mid ,int r){
        long inv=0;
        int n1 = mid-l+1;
        int n2 = r - mid;
        long[] a= new long[n1];
        long[] b=new long[n2];
        for(int i = 0;i<n1;i++){
            a[i] = arr[l+i];
        }
        for(int i = 0;i<n2;i++){
            b[i] = arr[mid+i+1];
        }
        int i = 0,j = 0, k = l;
        while(i<n1 && j<n2){
            if(a[i] <= b[j]){
                arr[k] = a[i];
                k++;i++;
            }
            else{
                arr[k] = b[j];
                inv += n1 - i;
                k++;j++;
            }
        }
        while(i<n1){
            arr[k] = a[i];
            k++;i++;
        }
        while(j<n2){
            arr[k] = b[j];
            k++;j++;
        }
        return inv;
    }
    static  long mergesort(long[] arr, int st, int end){
        long inv=0;
        if(st<end){
            int mid =(st+end)/2;
            inv+= mergesort(arr, st, mid);
            inv+=   mergesort(arr,mid+1,end);
            inv+= conquer(arr,st,mid,end);
        }
        return inv;
    }
}