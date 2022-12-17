package conditional_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		int dice = 0;
		if(arr[0] == arr[1]) {
			result++;
			dice = arr[1];
		}
		if(arr[1] == arr[2]) {
			result++;
			dice = arr[2];
		}
		if(arr[2] == arr[0]) {
			result++;
			dice = arr[0];
		}
		
		if(result == 0) {
			System.out.println(Math.max(Math.max(arr[0], arr[1]), arr[2])*100);
		}else if(result == 1) {
			System.out.println(1000+dice*100);
		}else {
			System.out.println(10000+dice*1000);
		}
		
		
		
	}
}
