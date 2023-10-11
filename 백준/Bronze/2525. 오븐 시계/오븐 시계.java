import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > 23 || a < 0) {
			System.out.println("다시 입력하세요");
		}
		if (b > 59 || b < 0) {
			System.out.println("다시 입력하세요");
		}
		if (c > 1000 || c < 0) {
			System.out.println("다시 입력하세요");
		}
		if (b + c < 60) {
			System.out.println(a + " " + (b + c));
		} else if (b + c >= 60) {
			int s = a + (b + c) / 60;
			if (s >= 24) {
				s = s % 24;
				b = (b + c) % 60;
				System.out.println(s + " " + b);
			} else {
				b = (b + c) % 60;
				System.out.println(s + " " + b);
			}
		}

	}
}