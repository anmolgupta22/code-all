#include <iostream>
using namespace std;
#include<stdio.h>

void main(void){
    int n;
    cin>>n;
    int arr[n];

    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int max = arr[0];

    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }

    cout<<max;

    
}