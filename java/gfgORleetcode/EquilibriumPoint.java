package gfgORleetcode;
import java.io.*;
import static java.lang.Integer.parseInt;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = parseInt(br.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            EquilibriumPoint ob = new EquilibriumPoint();

            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
class EquilibriumPoint {
    public static int equilibriumPoint(int[] nums , int n) {
        int totalSum = 0;
        int leftsum = 0;
        int i;
        for (int ele : nums)
            totalSum += ele;
        for ( i = 0; i < nums.length; i++)
            leftsum += nums[i];
        if (leftsum * 2 == totalSum - nums[i]){
            return i+1;     }
        return -1;
    }
}
