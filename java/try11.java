import java.lang.*;
class try11
{
    public static void main(String arg[])
    {
        int a[]={6, 5, 1, 4, 11,9, 8,14};
        int i,j,t;

        for(i=0;i<7;i++) {
            for (j = 0; j < 8 - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }

        }
            for(i=0;i<8;i++)
            {
                System.out.print(a[i]+" ");

            }
        }
    }
