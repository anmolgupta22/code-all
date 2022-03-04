#include<stdio.h>

struct node
{
    int data;
    struct  node*next;
    struct node*prev;
};
typedef  struct node node;
int main() {

    node *create(int k)
    {
        node *p;
        p = (node) *malloc(sizof(size))
        p->data = k;
        p->next = null;
        p->prev = null;
    }
    return 0;
}