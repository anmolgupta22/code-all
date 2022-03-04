#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int data;
    Node* next;
    Node* prev;
};
void push(Node** head_ref, int new_data)
{
    Node* new_node = new Node();
    new_node->data = new_data;
    new_node->next = (*head_ref);
    new_node->prev = NULL;
    if ((*head_ref) != NULL)
        (*head_ref)->prev = new_node;
    (*head_ref) = new_node;
}
void printList(Node* node) {
    Node *last;
    cout << "\nTraversal in forward direction \n";
    while (node != NULL) {
        cout << " " << node->data << " ";
        last = node;
        node = node->next;
    }
}
    int main()
    {
        cout<<"Name:Anmol Gupta"<<endl;
        cout<<"Reg no.-21MCA10057"<<endl;
        Node* head = NULL;
        push(&head, 22);
        push(&head, 42);
        cout << "Created DLL is: ";
        printList(head);

        return 0;
    }
