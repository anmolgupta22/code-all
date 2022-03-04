public class try10 {
    public static void main(String arg[]) {
        {
            int a[] = {54, 56, 52, 80, 41};
            int i, j, t;
            for (i = 0; i < 5; i++) {
                System.out.print(a[i]+",");


            }
            System.out.println();
        for(i = 0; i <4 ; i++)
           {

                for (j = 0; j < 5 - i - 1; j++)
                {
                    if (a[j] > a[j + 1]) {
                        t = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = t;
                    }
                }
            }
            for (i = 0; i < 5; i++) {
                System.out.print(a[i]+",");
            }
        }
    }
}