package gfg;
import java.io.*;
import java.util.*;

 class gfg1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new max_subarray().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class max_subarray {
    // Function to find maximum product subarray
    long sum=0;
    long count=0;
    long maxProduct(int[] arr, int n) {
        // code here
        for(int i=0;i<n;i++){
            sum=i;
            for(int j=i+1;j<n;j++){
                sum*=j;
                if(sum>count){

                    count=sum;
                }
            }
        }
        return count;
    }
}