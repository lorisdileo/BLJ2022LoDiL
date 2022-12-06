#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define NUM 100000
 
typedef struct Info {
    char price[20];
} TInfo;

int main() {
    char *p_Info = (char *) malloc(1000000 *sizeof(TInfo));
    TInfo info[NUM] = {0};
    
    for (int i = 0; i < NUM; i++)
    {
        strcpy(info[i].price, "15'000'000 CHF");
        printf("%s", info[i].price); 
    }
    
    
    /*strcpy(info[i].price, "15'000'000 CHF");
    strcpy(info[NUM].name, "Bugatti la voiture noire");
    strcpy(info[NUM].ps, "1500PS");*/
    free(p_Info);
}