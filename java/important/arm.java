package important;

public class arm {
    public static void main(String[] arg){
        System.out.print(armstrong(1512));

    }
    static boolean armstrong(int n){
        double arm=0;
        int rem;
        int check;
        check=n;
        int temp=n;
        int count=0;
        while (temp>0) {
            temp = temp / 10;
            count++;

        }
        while(n>0)
        {
            rem=n%10;
            arm+=Math.pow(rem,count);
            n=n/10;
        }
        if(check==arm){
          return true;
        }

return false;
    }
}
