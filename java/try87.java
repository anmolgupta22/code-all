public class try87 {
    public static void main(String arg[]){
    int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++) {
                System.out.print(" ");
            }
            for(int k=n-1-i;k<n;k++){
              System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
