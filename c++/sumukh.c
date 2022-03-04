#include<stdio.h>
#include<conio.h>
#include<string.h>
void username();
void uppercase();
void username()
{
    int a;
    char name[20];
    if (a > 6 && a < 15) {

        gets(name);

    }
}
        void uppecase()

        { if (ch>=65 && ch <= 90){

            scanf ("&ch);

        }

        }

        switch(ch)

        {

            case 1:

                username 0:

                printf("Enter the user name");
                printf("First character must be capital");
                uppercase();
                break;
                default:
                    printf("you entered an Invalid choice");
        }

    }
 }
int main() {

    char ch;
    char name[20];

    char pass[20];

    printf("press M for mal ");

    printf("press F for female");
    printf("Enter your choice");

    scanf("%c", &ch);

    if (ch == "M") {

        printf("uou entered the information of male candidate");

        printf("Enter user name");

        gets(name);

        int a = strlen(name);

        printf("Enter password");
        gets(pass);
    }
    if (ch == "F") {
        printf("you entered the information of female candidate");
        printf("Enter user name ");
        gets(name);
        int a = strlen(name);

        printf("Enter password");
        gets(pass);

    }
}