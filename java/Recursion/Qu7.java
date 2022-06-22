//linear
package Recursion;

public class Qu7 {
    public static void main(String arg[]) {
        int[] arr = {1, 34, 2, 23, 13, 63, 64};
        System.out.println(fun1(arr, 64, 0));
    }

    static int fun1(int[] arr, int k, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == k) {
            return index;
        }
        else {
            return fun1(arr, k, index + 1);
        }
    }
}
