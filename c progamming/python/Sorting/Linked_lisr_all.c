#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *head;

    int main()
    {
        beginsert();
        display();
    }

void beginsert() {
    struct node *ptr;
    int item;
    ptr = (struct node *) malloc(sizeof(struct node *));
    printf("\nEnter value\n");
    for (int i = 0; i < 5; i++) {
        if (ptr == NULL) {
            printf("\nOVERFLOW");
        } else {
            scanf("%d", &item);
            ptr->data = item;
            ptr->next = head;
            ptr = ptr->next;
            head = ptr;
            //printf("\nNode inserted");
        }
    }
    void display() {
        struct node *ptr;
        ptr = head;
        if (ptr == NULL) {
            printf("Nothing to print");
        } else {
            printf("\nprinting values . . . . .\n");
            while (ptr != NULL) {
                printf("\n%d", ptr->data);
                ptr = ptr->next;
            }
        }
    }
}