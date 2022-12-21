#include <stdio.h>

int main() {
  int a = 12;
  int b = 12;
  int c = 12;
  int i = 0;
  int j = 0;
  int k = 0;
  
  char n1n, n2n, n3n, n4n;
  n1n=n2n=n3n=n4n='x';
  
  printf("%c %c %c %c\n", n1n, n2n, n3n, n4n);

  printf("a + b + c = a * 3 = b * 3 = c * 3 = 36\n");
  printf("%d = %d = %d = %d\n\n", a + b + c, 3*a, 3*b, 3*c);

  printf("i + j + k = i * 3 = j * 3 = k * 3 = 0\n");
  printf("%d = %d = %d = %d\n\n", i + j + k, 3*i, 3*j, 3*k);

  return 0;
}