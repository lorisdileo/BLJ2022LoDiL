#include <stdio.h>
#include <math.h>

//War mähsam und schwer, aber habe es mit Loris zusammen gemacht. 

int isLeapYear(int year);
int daysInMonth(int month, int year);
void printDateInfo(int month, int year);

int main() {
    int year;
    int month;
    int is_running = 1;
   
 while(is_running)  {
   printf("Gib bitte ein Jahr ein: ");
   scanf("%d", &year);
   
   printf("Gib bitte einen Monat ein:");
   scanf("%d", &month);
   is_running = 0;
   }
    int result = isLeapYear(year);
   printDateInfo(month, year);

   return (0);
}

int isLeapYear(int year){ 
    if (year % 4 == 0) {
        if(year %100 == 0){
            if(year %400 == 0){
                return 1;
            } else{
                return 0;
            }
        } else{
            return 1;
        }
    }
    else {
        return (0);
   }
}
    int daysInMonth(int month, int year){
        if(month == 1){
        return 31;
        }else if (month == 2 && isLeapYear(year)== 1){
            return 29;
        }else if (month == 2 && isLeapYear(year)== 0){
            return 28;
        }else if(month == 3){   
            return 31;
        }else if(month == 4){   
            return 30;
        }else if(month == 5){   
            return 31;
        }else if(month == 6){   
            return 30;
        }else if(month == 7){   
            return 31;
        }else if(month == 8){   
            return 31;
        }else if(month == 9){   
            return 30;
        }else if(month == 10){   
            return 31;
        }else if(month == 11){   
            return 30;
        }else if(month == 12){   
            return 31;
        }
    }
        void printDateInfo(int month, int year){
    int days = daysInMonth(month, year);
    
    printf("Der Monat %d hat im Jahr %d %d Tage. \n", month, year, days);
    
    printf("Das Jahr %d ist ", year);
    if(!isLeapYear(year)){
        printf("kein ");
    }else{
        printf("ein ");
    }
    printf("Schaltjahr.\n");
}
        