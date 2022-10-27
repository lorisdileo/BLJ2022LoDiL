#include <stdio.h>

void makeUppercase(char *p_c1);
void makeLowercase(char *p_c3);

int main(){

char c1 = 'a';
char c2 = '!';
char c3 = 'L';
char c4 = 'T';

makeUppercase(&c1);
makeUppercase(&c2);
makeLowercase(&c3);
makeLowercase(&c4);

printf("%c%c%c%c", c1, c2, c3, c4);

return 0;
}

void makeUppercase(char *p_c1){
    if (*p_c1 >= 97 && *p_c1 <= 122){
        *p_c1 -= 32;
    }
}

void makeLowercase(char *p_c3){
    if (*p_c3 >= 65 && *p_c3 <= 90){
        *p_c3 += 32;
    }
}


