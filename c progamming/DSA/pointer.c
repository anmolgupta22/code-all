#include <stdio.h>
#include <stdlib.h>
int main()
{
  /*  int *ptr;
    int n;
    printf("Enter the size the array you want to number \n");
    scanf("%d",&n);
    ptr = (int *)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array \n",i);
        scanf("%d",&ptr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array %d\n",i,ptr[i]);
        
    }
    return 0;*/

    //calloc
    int *ptr;
    int n;
    printf("Enter the size the array you want to number \n");
    scanf("%d",&n);
    ptr = (int *)calloc(n, sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array \n",i);
        scanf("%d",&ptr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array %d\n",i,ptr[i]);

        
    }
    

    
    printf("Enter the size the new array you want to number \n");
    scanf("%d",&n);
    ptr = (int *)realloc(ptr, n*sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array \n",i);
        scanf("%d",&ptr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value no %d of this array %d\n",i,ptr[i]);

       
        
    }
    return 0;
}