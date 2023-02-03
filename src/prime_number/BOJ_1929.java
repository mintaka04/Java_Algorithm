package prime_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[max+1];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i*i <= max; i++) {
			if(!arr[i]) {
				for(int j = i*i; j<= max; j+=i) {
					arr[j] = true;
				}				
			}
		}
		
		for(int i = min; i <= max; i++) {
			if(!arr[i]) sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}
}
