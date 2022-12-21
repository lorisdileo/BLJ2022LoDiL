#include <stdio.h>

int main() {
  int numRepetitions = 50;

  while(1) {
    printf("THE END IS NEVER ");
    numRepetitions--;

    if(numRepetitions == 0) {
      printf("THE END");
      break;
    }
  }
  return 0;
}

