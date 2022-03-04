#include<iostream>
using namespace std;
void display(int arr[],int n)
{
for(int i1=0;i1<n;i1++)
{
    cout<<" "<<arr[i1];
}
}
void bubble(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
                swap(arr[i], arr[j]);
            }
        }
    }
}
    void selection(int arr[], int n)
    {
        int i,j,min;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    min = j;

//                temp = arr[min];
//                arr[min] = arr[j];
//                arr[j] = temp;
                }
                swap(arr[min], arr[i]);


            }
        }
    }
    void insertion(int arr[],int n)
    {
    int i,j,temp;
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}
int main()
{
    int arr[]={50,52,62,45,40};
    int n=sizeof(arr)/sizeof(arr[0]);

    cout<<"before sorting array elements are\n";
    display(arr,n);
    //bubble(arr,n);
    //selection(arr, n);
    insertion(arr,n);
    cout<<"\nAfter sorting array elements are\n";
   display(arr,n);

}