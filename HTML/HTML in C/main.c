#include <stdio.h>

int main(){
    int spalte;
    int reihen;
    
    printf("Wilkommen zur Tabelle generierung.\n");

    printf("Geben Sie die Anzahl Spalten an. \n");
    scanf("%d", &spalte);

    printf("Geben Sie die Anzahl Reihen ohne den Header an. \n");
    scanf("%d", &reihen);

    printf("<tr>\n");
    

for (int i = 0; i < spalte; i++)
{
    printf("\t<th></th>\n"); 

}

printf("</tr>");

for (int i = 0; i < reihen; i++)
{
    printf("\n<tr>\n");

    for (int i = 0; i < spalte; i++)
    {
        printf("\t<td></td>\n");
    }

     printf("</tr>\n"); 
}

    


    
    
    
    
    
    
    
    
    
    
    return 0;
}