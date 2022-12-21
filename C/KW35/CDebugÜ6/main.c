#include <stdio.h>

int main() {
  int num = 0;
  
  printf("Please enter a number between 12 and 42, but NOT 33: ");
  scanf("%d", &num);

  if(num >= 12 && num <= 42 && num != 33) {
    printf("Success! Your number was %d", num);
  } else if (num < 12) {
    printf("Error! %d is below 12", num);
  } else if (num == 33) {
        printf("Really? I told you not to", num);
  } else {
    printf("Error! %d is above 42", num);
  }
  return 0;
}

