#include<stdio.h>
int main()
{

    int n;
    printf("show");
    scanf("%d",&n);
    for (int i = 1; i <= n;i++)
    {
        for (int j = 1; j <= n; j++)
            printf ("%d %d \n", i, j);}
}