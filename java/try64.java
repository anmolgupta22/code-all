// { Driver Code Starts
import java.util.Scanner;



public class try64
{
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            GfG g = new GfG();
            g.printPat(n);
            System.out.println();

            t--;
        }
    }
}// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
        int[] array=new int[10];
        int i;
        // Your code here
        for(i=0;i<n;i++)
        {
            Scanner sc=new Scanner(System.in);
            array[i]=sc.nextInt();

        }
        for(i=0;i<n;i++){
            System.out.print(array[i]);
            System.out.print("$");
        }
        System.out.print("$");

    }
}