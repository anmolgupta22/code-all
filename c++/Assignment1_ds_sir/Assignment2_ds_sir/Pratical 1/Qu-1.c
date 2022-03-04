#include<stdio.h>
#include <stdlib.h>

int main()
{
    int i, j,temp;

    int num[5];
    int a[5];
    // int n = 10;
    int lower=-50000;
    int upper=50000;
    int count=0,swap=0;

    printf("Before sorting array elements are -\n");

    for(i=0;i<5;i++) {
        // int num[5];
        num[5] =rand(); //upper - lower + 1)) + lower;
        printf(" " "%d",num[5]);
    }
    for (int k = 0; k < 5; k++)
    {
        a[5]= num[5];


    }
    for(i=0;i<5;i++)
    {
        for (j = 1; j < 5 - i; j++)
        {                                                     //0,1,2
            if (a[j] < a[j - 1])
            {                                                  //9,-4,2
                temp = a[j];                                    //num[0];=9
                a[j] = a[j - 1];                                      //num[1]=num[0]=num[1]=-4
                a[j - 1] = temp;

            }
            swap++;

        }
        count++;

    }
    printf("\nAfter sorting array elements are - \n");
    for(i=0;i<5;i++)

    {

        printf(" %d",a[i]," \n");
    }
    printf("\n");

    printf( "Number of comparison= %d \n",count);
    printf( "Number of   swapping= %d \n",swap);
}






