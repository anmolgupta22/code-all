package Array;

import java.util.LinkedHashSet;

public class arr {
    public static void main(String[] arg) {
        int k = 0;
        int arr[] = {13, 331, 23, 13, 4, 45, 35, 45};
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        for (Integer i : arr) {
            h.add(i);
        }
        int ar[] = new int[h.size()];
        for (Integer i : h) {
            arr[k] = i;
            System.out.print(arr[k] + " ");
            k++;
        }
    }
}

