import java.util.ArrayList;
import java.util.Collections;
class profit{
    ArrayList<Integer> prof(int n, int[] arr, int k1){
        ArrayList<Integer> list=new ArrayList<>();
        int k = k1 - 1;
        int pro = 0;
        int cost = 0;
        int sub;
        for (int i = 0; i < k; i++) {
            pro += arr[i];

            for (int j = k; j < n; j++) {
                cost += arr[j];
            }
            sub = cost - pro;
            list.add(sub);
            if(k<n){
                k++;
            }

            cost = 0;
        }
        Collections.sort(list);
        return list ;
    }
}
public class try93 {

    public static void main(String [] args) {

        int[] arr = {4, 3, 2, 3};
        int n = arr.length;
        int k1 = 2;
       profit pr=new profit();
      ArrayList<Integer> list= pr.prof(n,arr,k1);
        System.out.println(list.get(list.size()-1));
        }
    }

