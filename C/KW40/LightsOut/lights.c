#include <stdio.h>
#include "lights.h"
#include <time.h>
#include <stdlib.h>

#define SIZE 5
#define FIELD_SIZE 5





void printField(int size, int field[SIZE][SIZE]) {
    printf("   0  1  2  3  4  ");
    printf("\n +--------------+\n");
    for (int row = 0; row < 5; row++) {
        printf("%d| ", row);
        for (int col = 0; col < 5; col++) {
            
                printf("%d  ", field[row][col]);
            
        }
        printf("\n");
    }
    printf(" +--------------+\n");
}


void ranNum(int (*field)[FIELD_SIZE][FIELD_SIZE]){
    srand(time(0));

    for( int x = 0; x < FIELD_SIZE; x++){
        for(int y = 0; y < FIELD_SIZE; y++){
            (*field)[x][y] = rand() % 2;
        }
    }
        
}