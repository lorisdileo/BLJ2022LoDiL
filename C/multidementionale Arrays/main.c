#include <stdio.h>
#include <stdlib.h>

#define FIELD_X 4
#define FIELD_Y 3

int main(int argc, char** argv) {

    int field[FIELD_X][FIELD_Y] = {{0}};
    int xIN;
    int yIN;

    printf("Du hast ein %dx%d Feld, trage bei jeder Koordinfate eine beliebige Zahl ein.\n", FIELD_X, FIELD_Y);

    for(int x = 0; x < FIELD_X; x++){
        for(int y = 0; y < FIELD_Y; y++){
            printf("Wert der Koordinaten x:[%d] y:[%d]", x, y);
            scanf("%d", &field[x][y]);
            fflush(stdin);
        }
    }
    printf("\nAusgabe der Koordinaten x:[%d] y:[%d]... \n\n", FIELD_X, FIELD_Y);
    for(int x = 0; x < FIELD_X; x++){
        for(int y = 0; y < FIELD_Y; y++){
            printf("\t%4d ", field[x][y]);
        }
        printf("\n\n");
    }

    system("pause");
    return (EXIT_SUCCESS);
}
