#include "test.h"

int main(void)
{
    float fData = 123.456;
    printf("%f\n", fData);
    printf("%.1f\n", fData);
    printf("%.2f\n", fData);
    printf("%.3f\n\n", fData);
    printf("%e\n", fData);
    printf("%g\n", fData);


    return 0;
}
