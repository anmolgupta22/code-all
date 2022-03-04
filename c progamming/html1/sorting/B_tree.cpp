#include<iostream>
using namespace std;
struct Node {
    int key;
    Node *left;
    Node *right;

    Node(int val) {
        key = val;
        left = right = NULL;
        //cout<<val<<endl;
    }
    void preorder(Node *root)
    {
        if(root!=NULL)
        {
            cout<<root->key<<"hello ";
            preorder(root->left);
            preorder(root->right);
        }
    }
    int height(Node * root)
    {
        if(root==NULL)
        {
            return 0;
        }
        else max(height(root->left), height(root->right));
    }
};
    int main()
    {
        Node *root;
        *root =*new Node(10);
        root->left=new Node(5);
        root->left->left=new Node(2);
        root->left->right=new Node(7);
        root->left->left->left=new Node(1);
root->preorder(root);
int k;
k= root->height(root);
cout<<k;
    }
