package javaws;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("hw5_1:황재현");

		// 사용자가 원하는 문자열을 입력받음
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // 문자열을 담을 배열의 크기 입력
		int[] array = new int[n]; // 배열 크기를 통해 문자열 배열 array 정의

		// 입력한 문자열을 공백 단위로 나누어 배열에 저장
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		// 정렬 결과를 출력
		System.out.println(select(array, 0, n - 1, 1)); // 1번째로 작은 수
		System.out.println(select(array, 0, n - 1, n / 2)); // n/2번째로 작은 수
		System.out.println(select(array, 0, n - 1, n)); // n번째로 작은

		input.close(); // Scanner 객체 사용 중지를 위해 close() 메소드 호출
	}

	// 선택 알고리즘을 통해 i번째로 작은 수를 출력하기 위한 select()
	private static int select(int[] array, int p, int r, int i) {
		if (p == r) // 배열에 저장된 값이 하나인 경우
			return array[p];
		int q = partition(array, p, r); // Quick sort에 활용한 partition()을 호출하여 변수 q에 저장
		int k = q - p + 1; // 기준값이 몇번째 작은 원소인가를 구하고,결과를 변수 k에 저장

		if (i < k) // 기준값을 기준으로 왼쪽 분할로 범위를 줄여서 재귀호출
			return select(array, p, q - 1, i);
		else if (i == k) // 기준원소 = 찾아야 할 원소인 경우
			return array[q];
		else // 기준 값을 기준으로 오른쪽 분할로 범위를 줄여서 재귀호
			return select(array, q + 1, r, i - k);
	}

	// array의 값들을 분할하기 위한 partition()
	private static int partition(int[] array, int p, int r) {
		int pivot = array[r]; // 가장 끝의 값을 기준값으로 선정
		int left = p - 1; // 기준값의 왼쪽 부분 중 1구역의 끝지점의 위치 저장

		for (int i = p; i < r; i++) {
			if (array[i] < pivot)
				swap(array, ++left, i);
		}
		swap(array, left + 1, r); // pivot값과 2구역의 처음 값을 교환
		return left + 1; // pivot값의 위치 반환
	}

	// array 내의 임의의 값 두개를 교환하기 위한 swap()
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
