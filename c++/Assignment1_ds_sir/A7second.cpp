#include<iostream>
using namespace std;

void hollowSquare(int rows)
{
    int i, j;
    for (i=1; i<=rows; i++)
    {
        // Print stars for each solid rows
        if (i==1 || i==rows)
            for (j=1; j<=rows; j++)
                cout << " "<<"*";

            // stars for hollow rows
        else
            for (j=1; j<=rows+1; j++)
                if (j==1 || j==rows)
                    cout << " "<<"*"<<"  ";
                else
                    cout << " ";

        // Move to the next line/row
        cout << "\n";
    }
}
void printPattern(int rows)
{
    hollowSquare(rows);
}

int main()
 {
     {
         int rows = 4;
         printPattern (rows);
         return 0;
     }
 }