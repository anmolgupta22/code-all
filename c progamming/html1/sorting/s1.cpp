#include<iostream>
using namespace std;
int main()
{

    int i,j,z,min;
    int a[6]={40,20,60,10,50,30};
    for(i=0;i<5;i++){
        j=i;
        min=a[i];
        for(j=i+1;j<=5;j++){
            if(a[j]<min){
                min=a[j];
                z=j;

            }
        }
        a[z]=a[i];
        a[i]=min;
    }
    for(int k=0;k<=5;k++){
        cout<<" "<<a[k];
    }

    return 0;
}
