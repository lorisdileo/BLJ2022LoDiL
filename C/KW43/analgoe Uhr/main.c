#include <stdio.h>
#include <math.h>
#include <time.h>


#define FIELD_SIZE 17


int main(int argc, char** argv){

    int clock[FIELD_SIZE][FIELD_SIZE];
    
    for (int i = 0; i < FIELD_SIZE; i++) {
        for (int j = 0; j < FIELD_SIZE; j++) {
            clock[i][j] = 100;
        }
    }

    int userInput = 0;
    printf("Geben Sie eine Anzahl Stunden ein.(0-23)\n");
    scanf("%d", &userInput);

    clock[8][8] = 0;

    switch (userInput)
    {
    case 0:
        clock[8][8] = 1;
        clock[7][8] = 1;
        clock[6][8] = 1;
        clock[5][8] = 1;
        clock[4][8] = 1;
        clock[3][8] = 1;
        break;
    
    case 1:
        clock[8][8] = 1;
        clock[6][9] = 1;
        clock[4][10] = 1;
        break;

    case 2:
        clock[8][8] = 1;
        clock[7][9] = 1;
        clock[6][10] = 1;
        clock[5][11] = 1;
        break;

    case 3:
        clock[8][8] = 1;
        clock[8][9] = 1;
        clock[8][10] = 1;
        clock[8][11] = 1;
        break;

    case 4:
        clock[8][8] = 1;
        clock[9][9] = 1;
        clock[10][10] = 1;
        clock[11][11] = 1;
        break;

    case 5:
        clock[8][8] = 1;
        clock[10][9] = 1;
        clock[12][10] = 1;
        break;

    case 6:
        clock[8][8] = 1;
        clock[9][8] = 1;
        clock[10][8] = 1;
        clock[11][8] = 1;
        clock[12][8] = 1;
        clock[13][8] = 1;
        break;

    case 9:
        clock[8][8] = 1;
        clock[8][7] = 1;
        clock[8][6] = 1;
        clock[8][5] = 1;
        break;

    case 12:
        clock[8][8] = 1;
        clock[7][8] = 1;
        clock[6][8] = 1;
        clock[5][8] = 1;
        clock[4][8] = 1;
        clock[3][8] = 1;
        break;

    case 13:
        clock[8][8] = 1;
        clock[6][9] = 1;
        clock[4][10] = 1;
        break;
        
    case 14:
        clock[8][8] = 1;
        clock[7][9] = 1;
        clock[6][10] = 1;
        clock[5][11] = 1;
        break;

    case 15:
        clock[8][8] = 1;
        clock[8][9] = 1;
        clock[8][10] = 1;
        clock[8][11] = 1;
        break;

    case 16:
        clock[8][8] = 1;
        clock[9][9] = 1;
        clock[10][10] = 1;
        clock[11][11] = 1;
        break;

    case 17:
        clock[8][8] = 1;
        clock[10][9] = 1;
        clock[12][10] = 1;
        break;

    case 18:
        clock[8][8] = 1;
        clock[9][8] = 1;
        clock[10][8] = 1;
        clock[11][8] = 1;
        clock[12][8] = 1;
        clock[13][8] = 1;
        break;

    case 21:
        clock[8][8] = 1;
        clock[8][7] = 1;
        clock[8][6] = 1;
        clock[8][5] = 1;
        break;
    }

    int userInput2 = 0;
        printf("Geben Sie die Minuten Anzahl ein.\n");
        scanf("%d", &userInput2);

        switch (userInput2)
    {
    case 15:
        clock[8][8] = 1;
        clock[8][9] = 1;
        clock[8][10] = 1;
        clock[8][11] = 1;
        clock[8][12] = 1;
        clock[8][13] = 1;
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

        break;

    case 45:
        clock[8][8] = 1;
        clock[8][7] = 1;
        clock[8][6] = 1;
        clock[8][5] = 1;
        clock[8][4] = 1;
        clock[8][3] = 1;
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
        break;
    }

    clock[8][8] = 0;
    clock[1][11] = 1;
    clock[4][13] = 2;
    clock[8][14] = 3;
    clock[12][13] = 4;
    clock[15][11] = 5;
    clock[16][8] = 6;
    clock[15][5] = 7;
    clock[12][3] = 8;
    clock[8][2] = 9;
    clock[4][3] = 10;
    clock[1][5] = 11;
    clock[0][8] = 12;

        
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


    for (int i = 0; i < FIELD_SIZE; i++) {
        for (int j = 0; j < FIELD_SIZE; ++j) {
            if(clock[i][j] == 100){
                printf("\t");
            } else {
                printf("%d\t", clock[i][j]);
            }
        }
        printf("\n\n");
    }

        

    return 0;
}
