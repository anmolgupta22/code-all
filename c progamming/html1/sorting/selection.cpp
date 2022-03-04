#include<iostream>
using namespace std;
void display(int arr[],int n)
{
    for(int i1=0;i1<n;i1++)
    {
        cout<<" "<<arr[i1];
    }
}
void selection(int arr[], int n)
{
    int min;
    int i,j;
    for (i = 0; i < n - 1; i++) {
        min = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
                min = j;