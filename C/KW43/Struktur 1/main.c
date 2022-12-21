#include <stdio.h>
#include <string.h>

 

typedef struct Info {
    char name[50];
    char ps[20];
    char price[50];

} TInfo;

 

void printInfo(TInfo info){
    printf("***************** \n");
    printf("Name: %s \n", info.name);
    printf("PS: %s \n", info.ps);
    printf("Price: %s \n", info.price);
    printf("***************** \n");
}

 

int main() {


    TInfo info = {0};
    strcpy(info.price, "15'000'000 CHF");
    strcpy(info.name, "Bugatti la voiture noire");
    strcpy(info.ps, "1500PS");


    TInfo info2 = {0};
    strcpy(info2.name, "LaFerrari Aperta");
    strcpy(info2.ps, "963PS");
    strcpy(info2.price, "8'300'000 CHF");


    TInfo info3 = {0};
    strcpy(info3.name, "Koenigsegg CCXR Trevita");
    strcpy(info3.ps, "1032PS");
    strcpy(info3.price, "4'200'000 CHF");
    
    printInfo(info);
    printInfo(info2);
    printInfo(info3);    

    return 0;
}