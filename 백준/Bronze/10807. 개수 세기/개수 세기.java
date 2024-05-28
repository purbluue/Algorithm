import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		StringTokenizer st;
		
		//입력
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++;
            }
        }
        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();


	}

}