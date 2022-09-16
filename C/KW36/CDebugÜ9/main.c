#include <stdio.h>

void swapValues(int *a, int *b);

void swapValues(int *a, int *b) {
  int temp = *a;
  *a = *b;
  *b = temp;
}

int main() {
  int a = 3; 
  int b = 5;
  
  printf("a = %d and b = %d\n", a, b);
  swapValues(&a, &b); // swap values of variables a and b
  printf("a = %d and b = %d\n", a, b);

  return 0;
}