#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    char data;
    struct Node *next;
}TNode;

/*void printList(TNode *head) {

    printf("%s\n", head -> data);
    do {
        head = head -> next;
        printf("%c\n", head -> data);
    } while (head -> next != NULL);
}*/

void printNode(TNode * head) {
    TNode * list = head;

    while (list != NULL) {
        printf("%c\n", list -> data);
        list = list -> next;
    }
}

int main() {
    
    TNode *head;

    TNode *list = (TNode *) malloc(sizeof(TNode));

    list -> data = 'A';

    list -> next = (TNode *) malloc(sizeof(TNode));

    list -> next -> data = 'C';

    list -> next -> next =  (TNode *) malloc(sizeof(TNode));

    list -> next -> next -> data = 'E';

    list -> next -> next -> next = NULL;

    head = list;
    printNode(head);
    return 0;
}


/*node delete_right(node list){
	node tmp   = list->next;
	list->next = list->next->next;
	free(tmp);
	return list;
}*/
