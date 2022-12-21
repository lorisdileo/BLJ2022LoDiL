#include <stdio.h>
#include <stdlib.h>

int addSum(int x, int y){
    return x + y;    
}

int subDif(int a, int b){
    return a - b;
}

int divNum(int n, int m){
    return n / m;
}

int main(int argc, char** argv) {

    int sum = addSum(7, 5);
    int dif = subDif(12, 2);
    int quo = divNum(9, 3);
    
    printf("%d %d %d", sum, dif, quo);
    return (0);
}
