package javaws;
import java.util.Scanner;

public class test {
    //main 메소드 실행                              
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성하기

        System.out.println("hw3_1: 황재현");
        System.out.print("정수 개수 입력: ");

        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.print(arraySize + "개의 정수 입력: ");

        //for 반복문을 이용하여 배열에 수 입력하기
        for(int i=0;i<array.length;i++)
        	array[i] = sc.nextInt();

        //최대값을 배열에서 알아내기 위한 변수 arrayMax
        int arrayMax = array[0];

        //최대값 찾아내기
        for(int j : array) {
        	if(arrayMax < j)
        		arrayMax = j;
        }

        //배열에서 최대값을 제외하고 출력하기
        System.out.print("최대값 제외 = ");
        for (int k=0;k<array.length;k++) {
            if (array[k] != arrayMax)
                System.out.print(array[k] + " ");
        }
        int counter = 0; // 최대값 개수를 저장할 변수

        //최대값 개수를 세어서 변수에 저장하기
        System.out.print("\n최대값 개수 = ");
        for(int l=0;l<array.length;l++) {
            if (array[l] == arrayMax)
                counter++;
        }
        System.out.print(counter); // 최댓값 개수 출력하기
        sc.close(); // Scanner 닫기
    }
}
