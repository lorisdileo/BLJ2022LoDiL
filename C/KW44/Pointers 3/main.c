#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int RanNums;

int getRanNums(unsigned int n) {
    
    srand(time(NULL));
    for (int i = 0; i < n; i++)
    {
        RanNums = rand() % 100 + 1;
    }
}

int main() {

    getRanNums(5);
    int *p_n = &RanNums;
    
   
    for (int i = 0; i < 5; i++)
    {
        printf("%d\n", getRanNums(RanNums));
    }

    return 0;
}