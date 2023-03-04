// main_arg.c
/* main()으로 전달되는 명령 인수들을 출력하는 프로그램 */
#include "test.h"
int main(int argc, char* argv[])
{
	int i = 0;

	for (i = 0; i < argc; i++)
		printf("명령어 라인에서 %d번째 문자열 = %s\n", i, argv[i]);

	return 0;
}