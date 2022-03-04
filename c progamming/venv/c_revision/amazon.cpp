#include<bits/stdc++.h>
using namespace std;


long long solve (long long N)
 {
     int count=0;

    while(N!=0)
    {
        N=N/10;
        count++;
    }
     int m,l,k;
     int d=0;
     for(int i=0;i<count;i++)
     {
          d=10;
          d*10;
     }
     for(int j=0;j<count;j++)
 {
     m=N/d;
     k=N % d;
l=m+k;
 }
  return l;   
/*int count=0;

    while(N!=0)
    {
        N=N/10;
        count++;
    }
    int array[count];
    long m=N;
for (int i = 5; i >= 0; i--) {
    array[i] = m % 10;
    m /= 10;
} 
int a[count]={0};
   for(int i=0;i<count;i++)
   {
       for(int j=1;j<count;j++)
       {
        a[count]=array[i]+array[j];
       }
   }
  return a[count];
}
*/
 }
int main() 
{

    ios::sync_with_stdio(0);
    cin.tie(0);
    int T;
    cin >> T;
    for(int t_i = 0; t_i < T; t_i++)
    {
        long long N;
        cin >> N;

        long long out_;
        out_ = solve(N);
        cout << out_;
        cout << "\n";
    }
}