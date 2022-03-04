#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() {
    //string s1, s2, s3;
    int i, j;
    int t[4];
    int m[4] = {6, 5, 1, 4};
    int m1[4] = {11, 9, 8, 14};
    string t1, t2, t3, t4, t5, t6, t7, t8;
    cout << "Enter first array number=";

    for (i = 0; i <= 3; i++) {
        cout << " " << m[i];
    }
    t1 = to_string(m[0]);
    t2 = to_string(m[1]);
    t3 = to_string(m[2]);
    t4 = to_string(m[3]);
   string s1 = t1 + t2 + t3 + t4;

    cout << endl;
    cout << "Enter second array number=";
    for (j = 0; j <= 3; j++) {
        cout << " " << m1[j];
    }
    t5 = to_string(m[0]);
    t6 = to_string(m[1]);
    t7 = to_string(m[2]);
    t8 = to_string(m[3]);
   string s2 = t5 + t6 + t7 + t8;
    cout << endl;
string s3=s1+s2;
    sort(s3.begin(), s3.end());
cout<<" "<<s3;
}

