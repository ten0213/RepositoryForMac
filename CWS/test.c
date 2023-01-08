// atoi.c
/* 문자열을 수치로 변환하여 연산 후 다시 문자열로 변환하여 출력하는 프로그램 */
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
	char s1[] = "1000";
	char s2[] = "12.93";
	char buffer[100];
	int i;
	double d;
	double result;

	i = atoi(s1);
	d = atof(s2);

	result = i + d;

	sprintf(buffer, "%f", result);
	printf("연산 결과는 %s입니다.\n", buffer);

	return 0;
}