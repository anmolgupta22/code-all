package pattern;

public class dai_2 {
    public static void main(String[] args) {
        int n=5;
        int k;
        for(int i=1;i<=n;i++){
            k=1;
            for(int j=1;j<=2*n-1;j++){

                if(j>=n+1-i && j<=n-1+i ){
                    System.out.print(k);
                    if(j<n){
                        k++;
                    }
                    else
                        k--;

                }
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
