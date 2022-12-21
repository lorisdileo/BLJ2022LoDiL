#include <stdio.h>
#include "utils.h"

#define FIELD_SIZE 4

/**
 * This programm depicts an all-time classic, the sliding puzzle. The one and 
 * only 0 represents the empty slot in the sliding puzzle. Moves (sliding up, 
 * down, left, right) are always made relative to the empty slot e.g. in the
 * case of the initial state of the field, only the moves left (swap 0 with 15)
 * and up (swap 0 with 8) can be made. This programm doesn't detect whether the 
 * field is sorted. It runs as long as the user doesn't enter a 0.
 * 
 * @return 0 if the programm was successfully run.
 */
int main(void) {
    int field[FIELD_SIZE][FIELD_SIZE] = {
        { 0, 15,  1, 13},
        { 8,  5,  2,  3},
        {14,  7,  4,  9},
        {10, 11,  6, 12},
    };
    int input = 0;
    int x = 0;
    int y = 0;
    
    do {
        printField(FIELD_SIZE, field);
        scanf("%d", &input);
         
        if(input == 1){
            if(y == 3){
               printf("Deine Eingabe kann nicht ausgeührt werden, geben Sie einen anderen Befehl ein."); 
            }
            else{swapValues(&field[x][y], &field[x][y + 1]);
            y += 1;
            }
        }
        else if(input == 2){
            if(x == 3){
               printf("Deine Eingabe kann nicht ausgeührt werden, geben Sie einen anderen Befehl ein."); 
            }
            else{swapValues(&field[x][y], &field[x + 1][y]);
            x += 1;
            }
        }
        else if(input == 3){
            if(x == 0){
               printf("Deine Eingabe kann nicht ausgeührt werden, geben Sie einen anderen Befehl ein."); 
            }
            else{swapValues(&field[x][y], &field[x - 1][y]);
            x -= 1;
            }
        }
        else if(input == 4){
            if(y == 0){
               printf("Deine Eingabe kann nicht ausgeührt werden, geben Sie einen anderen Befehl ein."); 
            }
            else{swapValues(&field[x][y], &field[x][y - 1]);
            y -= 1;
            }
        }
        else if(input > 4){
            printf("Gib eine gueltige untenstehende Zahl ein!!");
        }
    } while (input != 0);
        printf("Vielen Dank, dass du mein Spiel gespielt hast.\n");
    
    return 0;
}