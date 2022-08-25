package javaws;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = new int[6];
		for(int i=0; i<chess.length; i++) {
			chess[i] = sc.nextInt();
		}
		int[] rightPieceNum = {1, 1, 2, 2, 2, 8};
		int tmp = 0;
		for(int i=0; i<rightPieceNum.length; i++) {
			if(chess[i] != rightPieceNum[i]) {
				tmp = rightPieceNum[i] - chess[i];
				chess[i] = tmp;
			}
			else chess[i] = 0;
		}
		for(int i=0; i<chess.length; i++) {
			System.out.print(chess[i] + " ");
		}
		sc.close();
	}
}