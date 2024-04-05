#include "test.h"
#define LENGTH(a) sizeof(a) / sizeof(a[0])


void print(int a[], int n)
{
    for (int i = 0; i < n; ++i)
        printf("%d ", a[i]);
}


void insert(int a[], int n, int index, int value)
{
    for (int i = n - 1; i > index; --i)
        a[i] = a[i - 1];
    a[index] = value;
}
int main()
{
    int a[10];
    for (int i = 0; i < LENGTH(a); ++i)
        a[i] = i;
    insert(a, LENGTH(a), 9, 9);
    print(a, LENGTH(a));
    printf("\n");
    return 0;
}
