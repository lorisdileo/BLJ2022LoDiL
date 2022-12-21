#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    
    char a = 'p';
    char b = 'x';
    short c = 324;
    int d = 3200;
    long e = 328932;
    float f = 3.141593;
    double g = 2.717200;
    
    unsigned char uc = 252;

    printf("WERTE DER VARIABLEN\n");
    printf("____________________________________________________________________\n");
    printf("Variable        Zeichen         dez         hex         okt\n");
    printf("____________________________________________________________________\n");
    printf("c [char]        %c               %d          %x          %o\n",a,a,a,a);
    printf("c [char]        %c               %d          %x          %o\n",b,b,b,b);
    printf("s [short]                       %d          %x         %o\n",c,c,c);
    printf("i [int]                         %d         %x         %o\n",d,d,d);
    printf("l [long]                        %d       %x       %o\n",e,e,e);
    printf("f [float]                       %d   %x    %o\n",f,f,f);
    printf("d [double]                      %d   %x    %o\n",g,g,g);
    
    printf("uc[unsigned char]               %d         %x         %o\n");

    return (EXIT_SUCCESS);
}

