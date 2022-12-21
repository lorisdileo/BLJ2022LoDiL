#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *next;
}TNode;

void anyList(TNode *head){
    TNode *banane = head;
    
    while (banane != NULL)
    {
        printf("%d\n", banane -> data);
        banane = banane -> next;    
    }    
}

void printList(TNode *node)
{
    while (node != NULL) {
        printf(" %d ", node->data);
        node = node->next;
    }
}

void deleteNode(TNode *head, unsigned int n){

    TNode *nodeToDelete = head;

    for (int i = 0; i < n - 1; i++) 
    {
        nodeToDelete = nodeToDelete -> next;
    }

    TNode *addressCache = nodeToDelete -> next -> next;

    free(nodeToDelete -> next);

    nodeToDelete -> next = addressCache;

}

TNode *createNode(){
    TNode *newNode = (TNode *) malloc(sizeof(TNode));
    return newNode;
}

void initNode(TNode *head, unsigned int n, int data){

    TNode *nodeToInit = head;

    for (int i = 0; i < n - 1; i++)
    {
        nodeToInit = nodeToInit -> next;
    }

    TNode *addressInit = nodeToInit -> next;

    nodeToInit -> next  = (TNode *) malloc(sizeof(TNode));

    nodeToInit -> next -> data = data;
    nodeToInit -> next -> next = addressInit;
    
}

int main() {
    
    TNode *head = createNode();
    TNode *list1 = createNode(); 
    TNode *list2 = createNode();
    TNode *list3 = createNode();

    head -> next = list1;
    list1 -> next = list2;
    list2 -> next = list3;
    list3 -> next = NULL;

    head -> data = 0;
    list1 -> data = 1;
    list2 -> data = 2;
    list3 -> data = 3;

    deleteNode(head, 2);

    TNode *list4 = createNode();
    list3 -> next = list4;
    list4 -> next = NULL;
    list4 -> data = 4;

    initNode(head, 4, 11);

    printList(head);
    
    return 0;
}
