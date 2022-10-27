#include <stdio.h>
#include <math.h>


#define FIELD_SIZE 17


int main(int argc, char** argv){

    int clock[FIELD_SIZE][FIELD_SIZE];
for (int i = 0; i < FIELD_SIZE; i++) {
    for (int j = 0; j < FIELD_SIZE; j++) {
        clock[i][j] = 0;
    }
}

int userInput = 0;
printf("Geben Sie eine Uhrzeit ein.(In Minutenein)\n");
scanf("%d", &userInput);

switch (userInput)
{
case 15:
    clock[8][8] = 1;
    clock[8][9] = 1;
    clock[8][10] = 1;
    clock[8][11] = 1;
    clock[8][12] = 1;
    clock[8][13] = 1;
    clock[8][14] = 1;
    clock[8][15] = 1;
    clock[8][16] = 1;
    break;

case 30:
    clock[8][8] = 1;
    clock[9][8] = 1;
    clock[10][8] = 1;
    clock[11][8] = 1;
    clock[12][8] = 1;
    clock[13][8] = 1;
    clock[14][8] = 1;
    clock[15][8] = 1;
    clock[16][8] = 1;
    break;

case 45:
    clock[8][8] = 1;
    clock[8][7] = 1;
    clock[8][6] = 1;
    clock[8][5] = 1;
    clock[8][4] = 1;
    clock[8][3] = 1;
    clock[8][2] = 1;
    clock[8][1] = 1;
    clock[8][0] = 1;
    break;

case 60:
    clock[8][8] = 1;
    clock[7][8] = 1;
    clock[6][8] = 1;
    clock[5][8] = 1;
    clock[4][8] = 1;
    clock[3][8] = 1;
    clock[2][8] = 1;
    clock[1][8] = 1;
    clock[0][8] = 1;
    break;
}


    
    /*int field[FIELD_SIZE][FIELD_SIZE] = {
        { 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0},
        { 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0}

        
    };*/

    
    printf("Elements of given array: \n");
for (int i = 0; i < FIELD_SIZE; i++) {
    for (int j = 0; j < FIELD_SIZE; ++j) {
        if(clock[i][j] == 0){
            printf("\t");
        } else {
            printf("%d\t", clock[i][j]);
        }
    }
    printf("\n\n");
}

    

 return 0;
}