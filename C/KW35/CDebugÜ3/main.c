#include <stdio.h>

int main() {
  char policeName[] = "Stadtpolizei ZH";
  char policeAddress[] = "Bahnhofquai 3";
  int policePhone = 117;

  char pizzaName[] = "dieci Pizza Kurier";
  char pizzaAddress[] = "Hohlstrasse 204";
  int pizzaPhone = 442422070;

  printf("Wichtige Kontaktdaten:\n----------------------\n");
  printf("%s\n%s\n%d\n\n", policeName, policeAddress, policePhone);
  printf("%s\n%s\n", pizzaName, pizzaAddress);
  printf("0%d", pizzaPhone);

  return 0;
}

