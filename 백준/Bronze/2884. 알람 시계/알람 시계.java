import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(hour<0 || 23<hour) {
			System.out.println("다시 입력해 주세요");
		}
		if(min<0 || 59<min) {
			System.out.println("다시 입력해 주세요");			
		}
		if(min>=45) {	
			System.out.println(hour+" "+(min-45));
		}else if(min<45) {
			if(hour==0) {
				hour=23;
				min=(min+60)-45;
				System.out.println(hour+" "+min);
			}else if(hour>0) {
				hour=hour-1;
				min=(min+60)-45;
				System.out.println(hour+" "+min);
			}
			
		}
		
	}

}