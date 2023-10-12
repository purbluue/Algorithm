import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int f = 0; 
		
		
		if(a==b && b==c && a==c) {
			f=10000+a*1000;
			System.out.println(f);
		}else {
			if(a==b || a==c) {
				f=1000+a*100;
				System.out.println(f);
			}else if(b==a ||b==c) {
				f=1000+b*100;
				System.out.println(f);
			}else if(a!=b && b!=c && a!=c) {
				int f2 = 0;
				int m = 0;
				f=Math.max(a, b);
				f2=Math.max(a, c);
				m=Math.max(f, f2);
				System.out.println(m*100);
			}
		}

	}
}