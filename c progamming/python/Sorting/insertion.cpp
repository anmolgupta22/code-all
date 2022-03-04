#include <stdio.h>

void Insertion(int arr[], int n)
{
    int i, j;

    for (i = 1; i < n; i++) {
        while ( j >= 0;) {
            if (arr[j] > arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

void printArr(int a[], int n) /* function to print the array */
{
    int i;
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);
}

int main()
{
    int a[] = { 12, 31, 25, 8, 32, 17 };
    int n = sizeof(a) / sizeof(a[0]);
    printf("Before sorting array elements are - \n");
    printArr(a, n);
    Insertion(a, n);
    printf("\nAfter sorting array elements are - \n");
    printArr(a, n);
    return 0;
}    