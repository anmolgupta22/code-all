public class try75 {
    public static void main(String args[]){
        int[] arr={5,6,8,9,11,12,4,3,2,1};
        int len= arr.length;
        for(int i=0;i<len-2;i++){
            for(int j=1;j<len-1;j++){
                for(int k=2;k<len;k++) {
                    if (12 == arr[i] + arr[j] + arr[k]) {
                        System.out.print(arr[i]+" " + arr[j]+" " + arr[k]);
                        System.out.println();
                        k=j++;
                    }
                }
            }

        }

    }
}
