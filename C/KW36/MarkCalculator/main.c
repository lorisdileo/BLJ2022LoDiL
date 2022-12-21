#include <stdio.h>
#include <stdlib.h>

#define NUM_MARKS 10

int main(int argc, char** argv) {

    printf("-----------------------\n");
    printf("Average Mark Calculator\n");
    printf("-----------------------\n\n");

    float marks[NUM_MARKS];
    for(int i = 0; i < NUM_MARKS; i++) {
        printf("Please type your Marks in:     ");
        scanf("%f", &marks[i]);
        
        if(marks[i]<1 || marks[i] > 6){
            printf("Mark is invalid! Try again!\nEnter mark:");
            scanf("%f", &marks[i]);
            }
            
        }
    

    printf("-----------------------\n");

    float res = 0;
 
    res += marks[5];
    
    for(int a = 0; a < NUM_MARKS; a++) {
        res += marks[a];   
    }
    
    res /= NUM_MARKS;    
    printf("Your average mark is:     %.2f\n\n\n", res);
    
    /*
     *      - For every mark, input a weight and calculate the average accordingly.
     *      - Allow for the manipulation of individual marks, using the index.
     */

    return (EXIT_SUCCESS);
}

