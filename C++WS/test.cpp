#include <stdio.h>
#include <vector>
#include "test.h"
#include <assert.h>

using namespace std;

int main(void)
{
    int i, r;
    printf("hw1_1 : 송대원\n");

    printf("정수 개수 입력 : ");
    scanf("%d", &r);

    // 입력한 값의 크기가 배열의 크기가 되게끔 처리
    vector<int> a(r); // Use a vector instead of a C-style array

    printf("%d개의 정수 입력 : ", r);
    for (i = 0; i < r; ++i)
    {
        cin >> a[i];
    }

    int n = 0, max = a[0];
    for (i = 1; i < r; ++i)
    {
        if (max <= a[i])
        {
            max = a[i];
        }
    }

    // 최대값을 제외하고 출력함과 동시에 최대값의 개수를 함께 계산
    printf("최대값 제외 = ");
    for (i = 0; i < r; ++i)
    {
        if (a[i] != max)
        {
            printf("%d ", a[i]);
            ++n;
            continue;
        }
    }

    printf("\n최대값 개수 = %d", r - n);

    return 0;
}
