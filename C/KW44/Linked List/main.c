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

int main() {
    TNode *list = (TNode *) malloc(sizeof(TNode));

    list -> data = 'A';

    list -> next = (TNode *) malloc(sizeof(TNode));

    list -> next -> data = 'C';

    list -> next -> next = NULL;

    printf("%c\n", list -> data);
    printf("%c\n", list -> next -> data);

    return 0;
}
