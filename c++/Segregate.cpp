#include<iostream>
using namespace  std;
#include<stdio.h>
class Solution{
public:
    void segragate0and1(int arr[],int n)
    {
        int left=0,right=n-1;
        while(left<right){
            while (left<right){
                while(arr[left]==0&&left<right)left++;
                while (arr[right]==1&& left<right)right--;
                if(left<right){
                    arr[left]=0;
                    arr[right]=1;
                    left++;
                    right--;
                }
            }
        }
    }
};
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        Solution ob;
        ob.segragate0and1(arr,n);
        for(int i=0;i<n;i++) {
            cout << arr[i] << " ";
        }
        cout<<"\n";


    }
    return 0;
}