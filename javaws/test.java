package javaws;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello world!");
		int a = sc.nextInt();

		System.out.println(a * a);

		sc.close();
	}
}