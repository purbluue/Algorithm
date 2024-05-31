import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
        int max = arr[0];
        int min = arr[0];
		
		for(int j = 1; j<arr.length; j++) {
			if(arr[j]<min) {
				min = arr[j];
			}
			if(arr[j]>max) {
				max = arr[j];
			}			
		}
		
		bw.write(min + " " + max);
		bw.flush();
		br.close();
		bw.close();
		

	}

}