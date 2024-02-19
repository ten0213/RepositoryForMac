#include <stdio.h>

int factorial(int a)
{
  if (a == 0)
    return 1;
  else
    return a * factorial(a - 1);
}
int main(void)
{
  printf("Hello world!\n");
  printf("%d", factorial(6));

  return 0;
}

