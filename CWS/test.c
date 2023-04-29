// book.c
// 연결 리스트를 활용하여 데이터를 저장하는 프로그램
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define S_SIZE 50

typedef struct NODE {
	char title[S_SIZE];
	int year;
	struct NODE* link;
} NODE;

int main(void)
{
	NODE* list = NULL;
	NODE* prev = NULL, * p, * next;
	char buffer[S_SIZE];
	int year;

	// 연결 리스트에 정보를 입력한다.
	while (1)
	{
		printf("책의 제목을 입력하시오: (종료하려면 엔터)");
		gets(buffer);
		if (buffer[0] == '\0')
			break;

		p = (NODE*)malloc(sizeof(NODE));
		if (p == NULL) break;
		strcpy(p->title, buffer);
		printf("책의 출판 연도를 입력하시오: ");
		gets(buffer);
		year = atoi(buffer);
		p->year = year;

		if (list == NULL)
			list = p;
		else
			prev->link = p;
		p->link = NULL;
		prev = p;
	}
	printf("\n");

	// 연결 리스트에 들어 있는 정보를 모두 출력한다.
	p = list;
	while (p != NULL)
	{
		printf("[%s, %d]->", p->title, p->year);
		p = p->link;
	}

	// 동적 할당을 반납한다.
	p = list;
	while (p != NULL)
	{
		next = p->link;
		free(p);
		p = next;
	}

	return 0;
}
