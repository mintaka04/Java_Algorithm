package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10989 {
	
	static int N;
	static int[] arr = new int[10001];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		for(int i = 0; i < 10001; i++) {
			while(arr[i]-- > 0) sb.append(i + "\n");
		}
		
		System.out.println(sb);
	}
	
	
}
