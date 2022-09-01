// macro3.c
/* 내장 매크로와 ASSERT 매크로를 활용하여 변수의 값을 확인하는 프로그램 */
#include <stdio.h>
#include <stdlib.h>
#define ASSERT(exp) 	{ if (!(exp)) \
	{ printf("가정(" #exp ")이 소스 파일 %s %d번째 줄에서 실패.\n"\
	,__FILE__, __LINE__), exit(1);}}

int main(void)
{
	int sum = 100;		// 지역 변수의 초기값은 0이 아님

	ASSERT(sum == 0);	// sum의 값은 0이 되어야 함.
	return 0;
}

