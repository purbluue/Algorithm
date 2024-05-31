import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[9];

		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int index = 0;
		
		for(int j = 1; j<arr.length; j++) {
			if(arr[j]>max) {
				max = arr[j];
				index = j;
			}
		}

		bw.write(max + "\n");
		bw.write(index+1 + "\n");
		
		bw.flush();
		bw.close();
		br.close();

	}

}