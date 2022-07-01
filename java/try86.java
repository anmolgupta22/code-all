public class try86 {
    public static void main(String arg[]){
        int[] arr={1,2,3,4,3,2,1};
        int n=arr.length;
        int key=n/2+1;
        int m=n/2;
        for( int i=0;i<n;i++){
            if(key<arr[i]){
                System.out.println("Not Valid");
                System.exit(0);
            }
        }
        for(int i=0;i<m;i++){
            if(arr[i]-1!=arr[i+1]){
                System.out.print("Not Valid");
                System.exit(0);
            }
        }
        for(int i=n/2-1;i>0;i--){
            if(arr[i]-1!=arr[i-1]){
                System.out.print("Not Valid");
                System.exit(0);
            }
        }
        System.out.print("Valid");
    }
}
