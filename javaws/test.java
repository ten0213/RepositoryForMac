import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10개의 정수값을 입력받아 배열에 저장
        int[] numbers = new int[6];
        System.out.print("6개의 정수를 입력하세요: ");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 평균값 계산
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / 6;

        // 최댓값 찾기
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 평균값 이상, 최댓값 미만인 수 출력
        System.out.print("평균값 이상, 최댓값 미만인 수들: ");
        for (int number : numbers) {
            if (number < max && number >= average) {
                System.out.print(number + " ");
            }
        }
        scanner.close();
    }
}

