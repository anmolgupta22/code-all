//sort array check
package Recursion;

public class Qu6 {
    public static void main(String arg[])
    {
        int[] arr={1,2,3,4,56,57,443};
        System.out.println(fun(arr,0));
    }
    static boolean fun(int[] arr ,int index){
        if(index==arr.length-1)
            return true;
return arr[index]<arr[index+1] && fun(arr,index+1);
    }
}
