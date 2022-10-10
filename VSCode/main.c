#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

int main(int argc, char** argv) {
    int guess;
    int guessNumber; 
    int rn;
    int is_running = 1;
    int attempts = 4;
    
    srand(time(NULL));
    rn = rand() %20 + 1;
   // printf("%d", rn);
    
    printf("-----------------------------------\n");
    printf("WELCOME TO THE NUMBER GUESSING GAME \n");
    printf("-----------------------------------\n\n");
    printf("Guess a number between 1 and 20\n");
    
    while(is_running){
        
        
        printf("Please enter the number you want to guess\n");
        scanf("%d", &guess);
        
        if(guess == rn){
            printf("YOU WIN!\n");
            is_running = 0;
        }else if(attempts==0){
            printf("YOU LOST!\n");
            is_running = 0;
                    
        }
        
        else if(guess < rn)
        {
            printf("Your guess is too low.\n");
            printf("Try again.\n");
            --attempts;
        }
        else if(guess > rn){
            printf("Your guess is too high.\n");
            printf("Try again\n");
            --attempts;
        } 
        }
            
    

return (EXIT_SUCCESS);
}