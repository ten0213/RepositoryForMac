#include <stdio.h>

int sum(int a, int g)
{
    return a + g;
}
int main(void)
{
    printf("Hello world!\n");

    printf("%d\n", sum(1, 100));
    return 0;
}