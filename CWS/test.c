#include "test.h"

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);


    if(sizeof(a) != sizeof(int) || sizeof(b) != sizeof(int))
    {
        printf("Bad input");
    }
    else {
        double result = (double)a / b * 100;
        printf("%.1lf%%\n", result);
    }
    return 0;
}
