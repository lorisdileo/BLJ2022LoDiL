#include <stdio.h>
#include <stdlib.h>

#define BINARY_SEARCH 20

int main(int argc, char** argv) {
    
    int binary[BINARY_SEARCH] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    int findnum = 0;
    int min = 0;
    int max = BINARY_SEARCH;
    int mid = (min + max) / 2;
    short is_checking = 1;
    
    printf("--------------\n");
    printf("Binary Search\n");
    printf("--------------\n\n");    
    
    printf("Welche Zahl sollte gefunden werden? (1-20)\n\n");
    scanf("%d", &findnum, "\n");
         
    while (is_checking){
        
        if(findnum < 1 || findnum  > 20){
            printf("Die Zahl ist nicht vorhanden. Geben Sie eine andere Zahl ein.\t");
            scanf("%d", &findnum);
        }
        if(mid == findnum){
            printf("Die Zahl %d hat den INDEX %d\n\n\n", findnum, mid - 1);
            is_checking = 0;
        }
        else if(findnum == binary[max]){
            printf("Die Zahl %d hat den INDEX %d\n\n\n", findnum, max);
            is_checking = 0;
        }else if(findnum == binary[min]){
            printf("Die Zahl %d hat den INDEX %d\n\n\n", findnum, min);
            is_checking = 0;
        }else if(mid < findnum){
            
            min = mid;
            mid = (min + max) / 2;          
        }else{
            max = mid;
            mid = (min + max) / 2;
        }
    }
    
    
    return (EXIT_SUCCESS);
}




