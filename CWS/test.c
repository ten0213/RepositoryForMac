#include "test.h"

int add(int a, int b) {
    return a + b;
}

int main()
{
    int a = 1;
    int b = 20;
    int c = add(a, b);
    printf("c = %d\n", c);
    return 0;
}
