#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "lights.h"

#define FIELD_SIZE 5

int main(int argc, char** argv){

    int field[FIELD_SIZE][FIELD_SIZE] = {{0}};
    ranNum(&field);

    int x = 0;
    int y = 0;
    int isRunning = 1;
    
    while(isRunning){
        printField(FIELD_SIZE, field);
        printf("Eingabe:");
        scanf("%d", &x);
        scanf("%d", &y);

        if(field[x][y] == 1){
            field[x][y] = 0;
        
        } else{ 
            field[x][y] = 1;
        }
        
        if(5 > x + 1){
            if(field[x + 1][y] == 1){
            field[x + 1][y] = 0;
            
            } else{ 
            field[x + 1][y] = 1;
            }
        }
        
        if(-1 < x - 1){
            if(field[x - 1][y] == 1){
            field[x - 1][y] = 0;
    
            } else{ 
            field[x - 1][y] = 1;
            }
        }
        
        if(5 > y + 1){
            if(field[x][y + 1] == 1){
            field[x][y + 1] = 0;
            
            } else{ 
            field[x][y + 1] = 1;
            }
        }
        
        if(-1 < y - 1){
            if(field[x][y + 1] == 1){
            field[x][y - 1] = 0;
            
            } else{ 
            field[x][y - 1] = 1;
            }
        }
        
       
    } 
    system("pause");
    return (EXIT_SUCCESS);
    
}