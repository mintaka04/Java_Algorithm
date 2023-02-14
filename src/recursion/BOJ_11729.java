package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11729 {
	
	static int N;
	static StringBuilder sb = new StringBuilder();;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		sb.append((int)Math.pow(2, N) - 1 + "\n");
		hanoi(N, 1, 2, 3);
		System.out.println(sb);
		
	}
	
	static void hanoi(int N, int a, int b, int c) {
		if(N == 1) {
			sb.append(a + " " + c + "\n");
			return;
		}
		
		hanoi(N-1, a, c, b);
		sb.append(a + " " + c + "\n");
		hanoi(N-1, b, a, c);
	}
}
