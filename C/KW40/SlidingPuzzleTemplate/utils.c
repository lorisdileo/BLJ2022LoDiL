#include <stdio.h>
#include "utils.h"

/**
 * This function prints the given board state in an aesthetically pleasing way.
 * 
 * @param size  The size (both width and height) of the board.
 * @param field The board (2D array) to be printed.
 */
void printField(int size, int field[size][size]) {
    printf("\n+----+----+----+----+\n");
    for (int row = 0; row < size; row++) {
        printf("| ");
        for (int col = 0; col < size; col++) {
            if (field[row][col] != 0) {
                printf("%2d | ", field[row][col]);
            } else {
                printf("   | ");
            }
        }
        printf("\n+----+----+----+----+\n");
    }

    printf("+---------------+-------------+---------------+----------------+---------+\n");
    printf("| 1: Slide Left | 2: Slide Up | 3: Slide Down | 4: Slide Right | 0: Quit |\n");
    printf("+---------------+-------------+---------------+----------------+---------+\n");
}

/**
 * This function swaps the values of two given variables using their addresses.
 * 
 * @param num1  The address of the first variable.
 * @param num2  The address of the second variable.
 */
void swapValues(int *num1, int *num2) {
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}