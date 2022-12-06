/*von Luis Küng*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

void gameInput(int difficulty) {
    int guessedNum;
    int maxRandomNum;
    int randomNum;
    int limitAttempts = 0;
    int gameCounter = 1;
    bool infinityMode = false;
    bool winner = false;

    do {
        int attempts = 0;
        printf("----------\n");
        printf("Game %d\n", gameCounter);
        printf("----------\n");

        if (difficulty == 1) {
            limitAttempts = 10;
            maxRandomNum = 50;
        } else if (difficulty == 2) {
            limitAttempts = 7;
            maxRandomNum = 100;
        } else if (difficulty == 3) {
            infinityMode = true;
            printf("max number >");
            scanf("%d", &maxRandomNum);
            printf("How many tries will you give yourself? >");
            scanf("%d", &limitAttempts);
        } else {
            break;
        }

        srand(time(NULL));
        randomNum = rand() % maxRandomNum + 1;

        if (limitAttempts > 1) {
            printf("you have %d tries\n", limitAttempts);
        } else {
            printf("you have %d try\n", limitAttempts);
        }

        printf("The Range of numbers is %d to %d\n\n", 1, maxRandomNum);

        for (limitAttempts; limitAttempts > 0; limitAttempts--) {

            printf("> ");
            scanf("%d", &guessedNum);

            if (guessedNum == randomNum) {

                printf("YOU WON!\n");
                winner = true;
                attempts++;

                if (attempts != 1) {
                    printf("You guessed in %d tries\n", attempts);
                } else {
                    printf("You guessed in %d try\n", attempts);
                }

                attempts++;

                break;

            } else if (guessedNum == 0 && infinityMode == true) {

                infinityMode = false;
                break;

            } else if (limitAttempts > 1) {

                if (guessedNum < randomNum) {
                    printf("higher\n");
                } else {
                    printf("lower\n");
                }

                attempts++;
            }
        }

        if (winner != true) {
            printf("trash\n");
        }

        gameCounter++;

    } while (infinityMode);

    printf("end");

}

int main() {
    int difficulty;

    printf("---------------------------------------------\n");
    printf("Welcome to the Friday Challenge\n");
    printf("Guess the random number to win\n");
    printf("The fewer tries you need, the better you are\n");
    printf("---------------------------------------------\n\n");

    printf("Choose difficulty:\tEasy [1]\tHard [2]\tCustom (infinit) [3]\n--> ");
    scanf("%d", &difficulty);

    gameInput(difficulty);

}