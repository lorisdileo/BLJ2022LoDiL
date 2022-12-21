#include <stdio.h>

int main() {
  char selection = '\0';
  scanf("%c", &selection);

  switch(selection) {
    case 'a':
        printf("The quick brown fox jumps over a lazy dog.");
        break;
    case 'b':
        printf("Sphinx of black quartz, judge my vow.");
        break;
    case 'c':
        printf("Pack my box with five dozen liquor jugs.");
        break;
    default:
        printf("These are called pangrams.");
        break;
  }
  return 0;
}


