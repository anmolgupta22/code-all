#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() {

    int i, j,t1;
    int t[4];
    int m[4] = {6, 5, 1, 4};
    int n[4] = {11, 9, 8, 14};
    int mn[] = {6, 5, 1, 4, 11, 9, 8, 14};
    cout << "Enter first array number=";

    for (i = 0; i <= 3; i++) {
        cout << " " << m[i];
    }
    cout << endl;
    cout << "Enter second array number=";
    for (j = 0; j <= 3; j++) {
        cout << " " << n[j];
    }

    cout << endl;

    for(i=0;i<7;i++) {
        for (j = 0; j < 8 - i - 1; j++) {
            if (mn[j] > mn[j + 1]) {
                 t1 = mn[j];
                mn[j] = mn[j + 1];
                mn[j + 1] = t1;
            }
        }

    }
for(int i=0;i<8;i++)
{
    cout<<" "<<mn[i];
}
}

