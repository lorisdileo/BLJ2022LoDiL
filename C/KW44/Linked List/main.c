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

TNode *createNode(){
    TNode *newNode = (TNode *) malloc(sizeof(TNode));
    return newNode;
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
    list1 -> data = 3;
    list2 -> data = 8;
    list3 -> data = 6;

    anyList(head);

    return 0;
}

/*node delete_right(node list){
	node tmp   = list->next;
	list->next = list->next->next;
	free(tmp);
	return list;
}*/
