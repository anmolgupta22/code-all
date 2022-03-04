#include<iostream>
using namespace std;
void linear()
{
 int arr[]={10,50,64,71,34};
   int n = sizeof(arr)/sizeof(arr[0]);
    int item ,i=0;
    cout<<"enter the searching item:";
    cin>>item;
    while (i<n)
    {
       if(arr[i]==item)
       {
           cout<<"item found location :"<<i;
       }
       i++;
    }

    if(i>=n)
    {
cout<<"item is not found";
    }
}

void binary() {
    int arr1[] = {10, 20, 30, 40, 50};
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int i, l = 0, r = 4, f = 0, item, mid;
    cout << "Enter the searching item:";
    cin >> item;
    while (i < n1) {
        mid = (l + r) / 2;
        if (arr1[mid] == item) {
            f = 1;
            break;
        }
        if (arr1[mid] < item) {
            l = mid + 1;
        } else

            r = mid - 1;
    }
    if (f == 1) {
        cout << "item found location :" << mid;

    }
        else
        {

        cout << "not found";
    }

}
    int main() {
        //linear();
        binary();
    }
