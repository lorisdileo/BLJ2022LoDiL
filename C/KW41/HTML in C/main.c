#include <stdio.h>

int main(){
    int spalte;
    int reihen;
    
    printf("\nWilkommen zur Tabelle generierung.\n");

    printf("Geben Sie die Anzahl Spalten an. \n");
    scanf("%d", &spalte);

    printf("Geben Sie die Anzahl Reihen ohne den Header an. \n");
    scanf("%d", &reihen);

    printf("<table>");
    printf("\n\t<tr>\n");
    

for (int i = 0; i < spalte; i++)
{
    printf("\t\t<th></th>\n"); 

}

printf("\t</tr>");

for (int i = 0; i < reihen; i++)
{
    printf("\n\t<tr>\n");

    for (int i = 0; i < spalte; i++)
    {
        printf("\t\t<td></td>\n");
    }

     printf("\t</tr>\n"); 
}
printf("</table>");
  
    return 0;
}